*** Task1:
- Deploy the Java application with the Docker coordinates: bogdansolga/java-app:1.0
- Deploy the app via a Deployment, use 2 replicas for it (placed via node affinity), optionally: perform a rollout for v1.1
- Expose the app via a Service and an Ingress object (including the ingress controller)
- Mount a 'hostPath' type Volume in the container, write a file in it
- Configure the app container to use 256 MB of memory and 2 CPU cores

*** Task 2:
- Deploy a simple Java application that connects to a PostgreSQL database and displays a list of items from it (a list of people). The app runs on the port 8080, it exposes it's functionality on the path '/people'
  - I will provide the Java app Git repository, including the initial Dockerfile for it
- Build the Docker image, copy (save & load) it on each worker node
- Create the database using an InitContainer
- Map the DB connection password using a Secret
- Configure the readiness and liveness probes of the app container to monitor the app on the '/health' endpoint

*** Task 3:
- Deploy the app through a Helm chart, using the namespace and database connection URLs as template actions
