def Build_Docker_Image(){
     sh '`aws ecr get-login --region $region --no-include-email`'
      docker.withRegistry("{param.docker_registry_url}") {
        docker.build("{param.docker_repo}")
      }
}
