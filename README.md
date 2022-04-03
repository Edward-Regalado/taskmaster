# TaskMaster

## Lab 26: Beginning TaskMaster

### Overview

- Today, you’ll start building an Android app that will be a main focus of the second half of the course: TaskMaster. While you’ll start small today, over time this will grow to be a fully-featured application.

### Setup

- To start, create a new directory and repo to hold this app. Name it taskmaster. Within that directory, use Android Studio to set up a new app, as discussed in class. Create a README file that includes, at minimum, a description of your app and a daily change log.

### Resources

- Android Buttons
- Android UI Events

### Feature Tasks

### Homepage

- The main page should be built out to match the wireframe. In particular, it should have a heading at the top of the page, an image to mock the “my tasks” view, and buttons at the bottom of the page to allow going to the “add tasks” and “all tasks” page.

![Home](/screenshots/lab26/main.PNG)

### Add a Task

- On the “Add a Task” page, allow users to type in details about a new task, specifically a title and a body. When users click the “submit” button, show a “submitted!” label on the page.

![Home](/screenshots/lab26/addTask.PNG)
![Home](/screenshots/lab26/submitted.PNG)

### All Tasks

- The all tasks page should just be an image with a back button; it needs no functionality.

![Home](/screenshots/lab26/allTasks.PNG)

### APK

[APK build file](apk_builds/apk_lab26/app-debug.apk)


# Lab 27: Data in TaskMaster

## Overview 

-Today, you’ll add the ability to send data among different activities in your application using SharedPreferences and Intents.

### Feature Tasks

#### Task Detail Page

- Create a Task Detail page.
- It should have a title at the top of the page, and a Lorem Ipsum description.

<img src="/screenshots/lab27/task1.png" width="450">
<img src="/screenshots/lab27/task2.png" width="450">
<img src="/screenshots/lab27/task3.png" width="450">

#### Settings Page

- create a settings page. It should allow users to enter their username and hit save.

<img src="/screenshots/lab27/settings1.png" width="450">
<img src="/screenshots/lab27/settings2.png" width="450">

#### HomePage

- The main page should be modified to contain three different buttons with hardcoded task titles.
- When a user taps one of the titles, it should go to the Task Detail page, and the title at the top of the page should match the task title that was tapped on the previous page.

<img src="/screenshots/lab27/main1.png" width="450">
<img src="/screenshots/lab27/main2.png" width="450">

### Documentation

- Replace your homepage screenshot and add a screenshot of your Task Detail page into your repo, and update your daily change log with today’s changes.

[APK build file](apk_builds/apk_lab27/app-debug.apk)


# Lab 28: RecyclerViews for Displaying Lists of Data

##  Overview

- Today, you’ll refactor your homepage to look snazzy, with a RecyclerView full of Task data.

### Setup

- Continue working in your taskmaster repository.

## Resources

- RecyclerView
- Android Studio user guide

## Feature Tasks

### Task Model

- Create a Task class. A Task should have a title, a body, and a state. The state should be one of “new”, “assigned”, “in progress”, or “complete”.

### Homepage

- Refactor your homepage to use a RecyclerView for displaying Task data. This should have hardcoded Task data for now.

<img src="/screenshots/lab28/main.png" width="450">
<img src="/screenshots/lab28/task.png" width="450">

Some steps you will likely want to take to accomplish this:
  - Create a ViewAdapter class that displays data from a list of Tasks.
  - In your MainActivity, create at least three hardcoded Task instances and use those to populate your RecyclerView/ViewAdapter.
  - Ensure that you can tap on any one of the Tasks in the RecyclerView, and it will appropriately launch the detail page with the correct Task title displayed.

### Documentation

- Replace your homepage screenshot, and update your daily change log with today’s changes.

### Collaboration

- Hambalieu Jallow 

[APK build file](apk_builds/apk_lab28/app-debug.apk)

# Lab 29: Room

##  Overview

- Today, you’ll refactor your model layer to store Task data in a local database.

### Setup

- Continue working in your taskmaster repository.

## Resources

- [Save data in local database using Room](https://developer.android.com/training/data-storage/room)
- [Meet Android Studio](https://developer.android.com/studio/intro)

## Feature Tasks

### Task Model and Room

- Following the directions provided in the Android documentation, set up Room in your application, and modify your Task class to be an Entity.

### Add Task Form

- Modify your Add Task form to save the data entered in as a Task in your local database.

<img src="/screenshots/lab29/main.png" width="450">
<img src="/screenshots/lab28/task.png" width="450">

### Homepage

- Refactor your homepage’s RecyclerView to display all Task entities in your database.

### Detail Page

- Ensure that the description and status of a tapped task are also displayed on the detail page, in addition to the title. (Note that you can accomplish this by passing along the entire Task entity, or by passing along only its ID in the intent.)

### Documentation

- Replace your homepage screenshot, and update your daily change log with today’s changes.

### Collaboration

- Hambalieu Jallow

[APK build file](apk_builds/apk_lab29/app-debug.apk)


# Lab 31: Testing Views with Espresso and Polishing TaskMaster

## Overview

- Today, you’ll add UI tests to your application, and polish any remaining feature tasks from previous labs.

### Setup

- Continue working in your taskmaster repository.

### Resources

- [Espresso Testing](https://developer.android.com/training/testing/espresso)

## Feature Tasks

### Espresso Testing

- Add Espresso to your application, and use it to test basic functionality of the main components of your application. For example:
  - assert that important UI elements are displayed on the page
  - tap on a task, and assert that the resulting activity displays the name of that task
  - edit the user’s username, and assert that it says the correct thing on the homepage

### Polish

- Complete any remaining feature tasks from previous days’ labs.

[APK build file](apk_builds/apk_lab31/app-debug.apk)


# Lab 32: Integrating AWS for Cloud Data Storage

## Overview

- Today, your app will gain a scalable backend by using AWS Amplify. We’ll continue to work with Amplify to add more cloud functionality for the rest of the course.

### Setup

- Continue working in your taskmaster repository. Ensure that you have created an AWS account and installed the Amplify CLI, and follow the Amplify Getting Started directions to set up your application with Amplify.

### Resources

- Amplify Getting Started

## Feature Tasks

### Tasks Are Cloudy

- Using the `amplify add api` command, create a Task resource that replicates our existing Task schema. Update all references to the Task data to instead use AWS Amplify to access your data in DynamoDB instead of in Room.

### Add Task Form

- Modify your Add Task form to save the data entered in as a Task to DynamoDB.

### Homepage

- Refactor your homepage’s RecyclerView to display all Task entities in DynamoDB.

### Documentation

- Removed room database, updated imports and refactored necessary code, added GraphQL queries.

### Testing

- Ensure that all Espresso tests are still passing (since we haven’t changed anything about the UI today, no new updates required).

[APK build file](apk_builds/apk_lab32/app-debug.apk)

# Another Day, Another Model

## Daily Log 4/2/2022

### Updates

- updated add task form with team using a radio button

<img src="/screenshots/lab33/main.png" width="450">

### Work Time

- 


## Overview

- Today, your app will add a second resource on your backend, consumed by your frontend.

### Setup

- Continue working in your taskmaster repository.

### Resources

- [Amplify Getting Started](https://aws-amplify.github.io/docs/)

## Feature Tasks

#### Tasks Are Owned By Teams

- Create a second entity for a team, which has a name and a list of tasks. Update your tasks to be owned by a team.

- Manually create three teams by running a mutation exactly three times in your code. (You do NOT need to allow the user to create new teams.)

### Add Task Form

- Modify your Add Task form to include either a Spinner or Radio Buttons for which team that task belongs to.

### Settings Page

- In addition to a username, allow the user to choose their team on the Settings page. Use that Team to display only that team’s tasks on the homepage.

[APK build file](apk_builds/apk_lab33/app-debug.apk)