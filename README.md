# Cookbook for building and running the applications

Backend app : display-time-zone
Frontend app : display-time-zone-ui

### Prerequisites
* Install Apache maven (3.6.1 or higher), Java (OpenJDK 11), NodeJS (v14.18.0), Yarn (1.22.15)

# Clone the project
$ git clone https://github.com/omgue/displaydatetime.git

### Build backend application
```bash
    cd display-time-zone
    mvn clean install
```

### Build frontend application
```bash
    cd display-time-zone-ui
    yarn install
    yarn build
```

### Running the applications
```bash
    cd docker
    docker-compose up -d --build
```
* Go to http://localhost:3000
