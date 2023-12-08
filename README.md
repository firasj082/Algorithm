# GitHub Repository Setup Guide

## Introduction

In this exercise, we will guide you through setting up a GitHub repository using Git, a popular version control system. GitHub is a platform for hosting and collaborating on Git repositories, enhancing project management, code sharing, and teamwork.

GitHub provides a robust issue tracking system, supports collaboration through features like forking, pull requests, and code reviews, and facilitates project documentation with integrated wikis. It has become a key component of modern software development, fostering a dynamic and cooperative environment.

## Steps

### 1. GitHub Repository Setup

#### Creating a GitHub Account

- Visit [GitHub](https://github.com) and sign up.
- Enter your email address and corresponding data.

#### Create a New Public Repository on GitHub

- After creating an account, go to your profile > Your Repositories > New.
- Enter the repository name, description (optional), and choose public or private.

### 2. Initialize Local Repository with Git

#### Initialize a Local Folder as a Git Repository

- Right-click on the folder > Git Bash.
- Use the command: `git init` to initialize the local repository.

### 3. Connect Local Repository to the Remote GitHub Repository

- Add the remote repository using: `git remote add <name> <URL>`.
- Check if repositories are connected with: `git remote`.

### 4. Upload Factorial Calculation Code

- Add code to the staging area with: `git add <filename>` or `git add .` (to add all files).
- Check staging area status with: `git status`.
- Commit changes to the local repository using: `git commit -m "commit message"`.
- Push changes to the remote repository with: `git push <remote-name> <branch-name>`.

- Check commits with: `git log` or `git log --oneline`.

## Results

The factorial calculation code is now added to GitHub. Visit the repository [here](https://github.com/firasj082/Algorithm.git).
