def Git_CheckOut(){
    git branch: "${param.branch_name}", url: "${param.git_url}"
}
