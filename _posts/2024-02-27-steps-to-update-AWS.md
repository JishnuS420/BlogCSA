---
toc: true
comments: true
layout: post
title: AWS Deployment Update
description: Steps for Updating an AWS Deployment
type: hacks
courses: {csa: {week: 23} }
---
## Steps:
1. You would login into the AWS under your credentials 
2. Go to your specific instance that you created to manage your website
3. You would then navigate to the deployments file by doing `cd /deployments`
4. To be safe, perform an `ls` command and make sure that you do see your repository so that you aren't messing with anybody elses thing 
5. You would then cd into your repository file
6. Before doing anything, you would first take your runtime down so tht it doesn't break the server
7. After getting confirmation from AWS that the site went down, you would then perform a git pull command
8. After receiving confirmation of a successful git pull, you can then rebuild up your site 