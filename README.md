# gateway
## docker consul

docker run -d --net=host -p 8500:8500 -h node1 --name consul  consul agent -server -bootstrap-expect=1  -node=node1 -client 0.0.0.0 -ui  

docker run -d --net=host  -v D:\data\consul:/consul/data  -h node1 --name consul  consul agent -server -bootstrap-expect=1  -node=node1  -bind 192.168.211.33 -client 0.0.0.0 -ui  -data-dir /consul/data -config-dir /consul/config   

docker run -d --net=host  -v D:\data\consul:/consul/data --name consul  consul agent -dev -bootstrap-expect=1  -ui  -data-dir /consul/data -config-dir /consul/config   



docker run -d  -p 8500:8500   -v D:\data\consul:/consul/data  -h node1 --name consul  consul agent -server -bootstrap-expect=1  -node=node1 -client 0.0.0.0 -ui  -data-dir /consul/data -config-dir /consul/config   



config/gateway/data