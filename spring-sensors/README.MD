# Demo application for VMware Tanzu Application Platform

An application to demonstrate the capabilities of [VMware Tanzu Application Platform](https://tanzu.vmware.com/application-platform).

This application acts as a consumer of sensor data which the application stores in an in-memory database and displays on a dashboard.
The sensor data is generated and sent by [this](https://github.com/tanzu-end-to-end/spring-sensors-sensor) application via asynchronous messaging.

[Spring Cloud Stream](https://spring.io/projects/spring-cloud-stream), a framework built on top of Spring Boot and Spring Integration, is used as a flexible messaging abstraction. 
Spring Cloud Stream supports a variety of binder implementations. In this case, we are using the one for RabbitMQ.

So as a prerequisite to run this application with VMware Tanzu Application Platform, you need a RabbitMQ cluster running in the same Kubernetes namespace (e.g. provisioned via the [RabbitMQ Cluster Operator for Kubernetes](https://www.rabbitmq.com/kubernetes/operator/operator-overview.html)).
```
kubectl apply -f - << EOF
apiVersion: rabbitmq.com/v1beta1
kind: RabbitmqCluster
metadata:
  name: rmq-1
EOF
```


Binding an application workload to a backing service such as a RabbitMQ queue is one of the most important use cases within the context of the VMware Tanzu Application Platform. 
This use case is made possible by the [Service Binding Specification](https://github.com/servicebinding/spec) for Kubernetes.
With the service binding that is defined in the [workload.yaml](tap/workload.yaml), the credentials that are required for the connection to the RabbitMQ cluster are magically injected as environment variables into the container.

To deploy this application on VMware Tanzu Application Platform, execute the following command:
```
tanzu apps workload create spring-sensors -f tap/workload.yaml
```
