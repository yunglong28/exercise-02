# Exercise 2

This exercise is about git. You are expected to clone a repository, create a new branch, make some changes on this branch, and push your changes to our GitHub organisation.

## Step 1
As the first task, you will need to get a running git installation on the computer you'll be using in the semester. If you are interested in the barebones git installation, [this guide](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) should help you. It explains how to install git for the various operating systems. This will give you the most up to date version and the purest experience, but it will probably not be pretty. There are, luckily, a few alternatives with graphical user interfaces:

- GitHub also provides a [Desktop client](https://desktop.github.com)
- The client I've shown in class is called [SourceTree](https://www.sourcetreeapp.com), but you will need yet another account to use it (this time from Atlassian)
- [GitKraken](https://www.gitkraken.com) is finally a tool that is also available for Linux (but also Windows and Mac)

Feel free to experiment what you like the most.

## Step 2

Please clone this repository onto your local computer. On the command line, you would enter: `git clone https://github.com/idh-cologne-tools-ressourcen-infra/exercise-02`.

## Step 3
Create a new branch using your UzK username as a name (in my case, it would be nreiter2). If you feel creative, choose any other name (that no one else will take ...). On the command line, you would enter: `git checkout -b BRANCHNAME`.

## Step 4
The file `main.java` in the top level directory of the repository contains Java code. The file contains an attempt by a beginner in Java programming to write a program that prints out two columns of integers. The first column is just a sequence of integers increased by one. The second column contains values that are the product of the value in column 2 from the row before and the column 1 in the current row. I.e., the intended output was:
```
1 15
2 30
3 90
4 360
...
```

Unfortunately, our beginner has made quite a few mistakes in their program. Please fix all the mistakes, and verify afterwards that your program compiles and generates the proper output.

## Step 5

Commit your changes, don't forget to use a meaningful commit message.

## Step 6

Push your changes to the remote repository, i.e., GitHub. If you're on command line, you'll also need to specify that the remote branch has the same name as your local branch. Concretely, you'd enter this: `git push --set-upstream origin BRANCHNAME` (yes, you can have different branch names on the remote server than locally, but this is very confusing, so better don't ...).