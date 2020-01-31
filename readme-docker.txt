#se placer (cd) dans répertoire env-ic-my-java-rest-app 
#(où est situé Dockerfile et target/env-ic-my-java-rest-app.jar construit par maven)
su
docker image build -t dockregistry.mycompany.fun/env-ic-my-java-rest-app  .
docker image ls
docker run -p 8080:8080 -d --name my-api-container --network mynetwork --network-alias=my.api.host dockregistry.mycompany.fun/env-ic-my-java-rest-app
docker container ls
