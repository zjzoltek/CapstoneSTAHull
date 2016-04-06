# CapstoneSTAHull

This repository is for the STA Development Team in Mrs. Hull's room for working on the capstone project. 

# How to use GitHub

This will not tell you how to use all of github, just what you need to know. When you are finished for the day, you will do this.

* Open up github (the program not shell)[Example](Pics/gitshellbluetext.png)
* Make sure you have the right repository selected (CapstoneSTAHull)[Example](Pics/rightRepoSelected.png)
* Make sure you have the right branch selected (Should be yourname-work where yourname is your name)[Example](Pics/rightBranch.png)
* Click the cog-wheel in the top right and click "Open in Git-Shell"[Example1](Pics/cogWheel.png)|[Example2](Pics/openingitshell.png)
* Once the shell opens you will see your branch name in a fancy color (if it is not your branch name you need to exit and make sure you are on your own branch in the github program)
* If the branch is blue, then everything is good![Example](Pics/gitshellbluetext.png)
* If it is green then you need to do the command "git push". [Example](Pics/greenshell.png)
* If your name has some red numbers after it, then you need to do "git add --all".[Example](Pics/gitshellRedText.png)
* If your name has some green numbers after it, you need to commit, so use the command "git commit -a".[Example](Pics/gitshellgreentext.png)
* Once you commit, you'll see a file popup in notepad. What you need to do here is write what changes you made and why. Once you write that, go ahead and save and close the window, and then do "git push". 
* IF YOU HAVE HAD YOUR CONSOLE WINDOW OPEN FOR A WHILE, THE FIRST THING YOU NEED TO DO IS USE "git status" SO YOUR COLORS UPDATE
* If your shell is red, then that means you need to use "git pull"
* Now, lets say for example that Johnny wants to pull in all of Danny's work onto his computer. To do that you would go to the github program, go to Danny's branch, go into git shell, and do "git pull" and you would pull in his entire branch!
* Thats it! You should do this on a semi-regular basis. Doesn't actually matter how often, just make sure you do it
* ONLY COMMIT TO YOUR BRANCH! When you have a working version of whatever needs to be done on your branch, then we can make a pull request to the vNext branch, and once its cleared there, we can pull with master

# Coding Standards

In order to maximize readability and reduce bugs, we need to make sure our classes conform to the following standards.

* All warnings in netbeans MUST be attempted to be resolved. This means that if netbeans suggests that a variable should be final, please make it final. The more immutability that we have, the better, because that means less bugs.
* Please, please, PLEASE make your code portable. This project will absolutely have to be object oriented. Now I know that Java pretty much forces OOP, but there are ways you can get aruond it, and it isnt pretty, nor easy to work with. Every class should be able to be taken from its package, and used in another
* Camel-back notation is a must, and all constants must be in CAPS. 
* Please use the keyword "static". Static methods and variables belong to the class itself and not its instances, and they can be used without actually creating the class itself. ALL public constants should be made static. All of them.
* In netbeans there is a print margin which is basically just a line that separates the page. If your code goes past this point, please cut the statement into two lines or more. We don't need code lines that are going all the way off the screen
* Variable names need to be reflective of what the actual data is for and what it is doing. Same for methods.
* Be wary of when abstract classes should be used. Abstract classes make it very easy for OOP principles to be followed
* DO NOT EXTEND JFRAME
* Comments are not needed everywhere. If your creating a JFrame and showing it, then please, do not comment. That is a very basic operation and everybody can spot a mile away. Sectioning your code off with commas is absolutely required however. YOU MUST WRITE IN HEADER COMMENTS FOR SECTIONS! This means stuff like "sorting begins here" or "setting up jframe" or "adding in panels" and so on. Your code needs these comments so that when someone else dives in, or when you dive in, you have signs to tell you where to go. But in terms of commenting line-by-line: that is up to you. If the lines are complex then comment. If they are simple, then leave it alone and work on actual code.
* Please, if you do not understand how to do something, go online. Search stackoverflow or use the java tutorials located at https://docs.oracle.com/javase/tutorial/index.html. If you can't find it yourself, then ask someone nearby. If this "something" is simple like setting a jframe to cover the whole screen, then yeah ask a neighbor. But if you want to know something like "how do I setup a tabbed pane?", then you need to go online
* PACKAGES PACKAGES PACKAGES! In netbeans you can create packages to categorize your classes. PLEASE DO THIS. Nobody wants to go onto your github branch, go into your 'src' folder, and find a twenty classes. You need to categorize. If you have multiple classes that extend JPanel and are used for GUI, then put them in a GUI package. If you have backend logic that deals with checking overdue reports, put it into a seperate package. If you cannot categorize it, then you can leave it in the base package which should be "Capstone<initials>"
* USE THE AUTOCOMPLETION IN NETBEANS! I cannot tell you how many problems have been caused in the past simply because people misspelled a variable or a method. USE AUTOCOMPLETE! If you cannot find it in autocomplete, then its private or protected and you should change that
* ALL VARIABLES NEED TO BE BY DEFAULT PRIVATE! Unless you want other classes using them, your variables should be private. And unless you are going to re-instantiate the variable, make it final too. Most methods can be public, but most variables should be private with getters and setters. Again, just like constants, this reduces bugs and improves readability. Immutability in this project will help us so much.
* Refrain from using 'this' unless two variables conflict. For instance, if you are writing a constructor that takes an int called "score", and you have a private int of that class called "score", and you want to set the class' "score" to the "score" in the constructor, then you need to use this.score = score. But if the parameter passed to the constructor is "points", then please use score = points, not this.score = points. Reducing usage of "this" where not needed improves readability
* One class per file please.
* Basic enums can be put inside classes, but very large enums need to be in their own file
* Enums in classes and inner-classes should almost always be made static
* Use float instead of double unless absolute precision is necessary
