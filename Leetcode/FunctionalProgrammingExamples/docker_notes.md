# docker overlay network
 -for communicating between the docker containers placed in seperate vms (physical server)

# container port mapping
- to communicate from the outside world to the container
- from outside world to teh port of the vm server then to teh port of the docker container

# container orchestration using  kubernetes
- pod : smallest deployable unit in kubernetes
- each pod  is having the ip address

# container network interface (CNI)
 -cni plugins are connected to the newly created plugin and which will create the virtual ethernet interface assigns it - an ipaddress so that pods in  different "nodes" can communicate in the cluster
 - these ip address of the pods chnges when pods are restarted , replaced and moved
 -> cluster-> nodes-> pods

### kubernetes services
# kube proxy
- enables load balancing and service discovery
# kube dns

# Ingres
- define how the traffic from the outside cluster should reach the services inside the cluster
# network policies



