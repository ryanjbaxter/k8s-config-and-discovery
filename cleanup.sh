kubectl delete -f spring-sensors/k8s
kubectl delete -f spring-sensors-sensor/k8s
kubectl delete -f spring-sensors-location-service/k8s
kubectl delete -f config-server-deployment.yaml
kubectl delete -f k8s-discovery-server.yaml
kubectl delete -f application-configmap.yaml
kubectl delete -f application-secret.yaml