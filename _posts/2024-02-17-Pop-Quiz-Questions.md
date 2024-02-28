---
toc: true
comments: true
layout: post
title: Pop Quiz Questions
description: The question for the pop quiz
type: hacks
courses: {csa: {week: 23} }
---

# 1. Show JWT login successful 

- Show the working login and then verify it through jwt.io

# 2. Show POJO in the java backend 

- Show the java backend and person class

# 3. Explain the security configuration rules for access 

- Show the securityconfig file

# 4. Update docker repository in the AWS

## Steps:
1. You would login into the AWS under your credentials 
2. Go to your specific instance that you created to manage your website
3. You would then navigate to the deployments file by doing `cd /deployments`
4. To be safe, perform an `ls` command and make sure that you do see your repository so that you aren't messing with anybody elses thing 
5. You would then cd into your repository file
6. Before doing anything, you would first take your runtime down so tht it doesn't break the server use the command: `docker-compose down`
7. After getting confirmation from AWS that the site went down, you would then perform a `git pull` command
8. After receiving confirmation of a successful git pull, you can then rebuild up your site: `docker-compose up -d --build`

# 5. Make a 403 Forbidden Page

