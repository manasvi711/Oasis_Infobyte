
# Online Exam Management System

## Overview
This Java-based Online Exam Management System is designed to manage user authentication, profile updates, and conduct timed exams. The system is console-based and demonstrates fundamental Java programming concepts, including object-oriented programming, user input handling, and data storage using collections.



## Features

- **User Authentication:** Users can log in using a secure username and password system.
- **Profile Management**: Users can update their email and phone number.
- **Password Management:** Users can securely update their passwords.
- **Timed Exam:** Users can take a timed exam, with questions auto-submitted when time is up.
- **Score Evaluation:** The system evaluates the user's answers and provides instant feedback on their performance.


## Structure
- **User.java:** Handles user-related operations, including profile and password management.
- **UserDatabase.java:** Manages the storage and retrieval of users in a HashMap.
- **Exam.java:** Manages the exam process, including presenting questions, timing, and score evaluation.
- **OnlineExam.java:** The main class that ties everything together, providing the interface for the user to log in, manage their profile, take exams, and log out.
## How to Run

1. CLone the repository:
```bash
    git clone https://github.com/hitha0511/OASIS_INFOBYTE/tree/main/OnlineExamManagementSystem.git
```
2. Navigate to the project directory:
```bash
cd online-exam-system
```
3. Compile the Java files:
```bash
javac -d . User.java UserDatabase.java Exam.java OnlineExam.java
```
4. Run the application:
```bash
java oasis.OnlineExam
```

## How to Run

1. CLone the repository:
```bash
    git clone https://github.com/hitha0511/OASIS_INFOBYTE/tree/main/OnlineExamManagementSystem.git
```
2. Navigate to the project directory:
```bash
cd online-exam-system
```
3. Compile the Java files:
```bash
javac -d . User.java UserDatabase.java Exam.java OnlineExam.java
```
4. Run the application:
```bash
java oasis.OnlineExam
```

## Usage
- **Login:** Enter your username and password to access the system.
- **Update Profile:** Update your email and phone number.
- **Update Password:** Change your password securely.
- **Take Exam:** Answer the exam questions within the given time limit.
- **Logout:** Log out of the system.

## Requirements
- Java 8 or higher

## Future Enhancements
- **GUI Integration:** Implement a graphical user interface for better usability.
- **Database Integration:** Replace the HashMap-based user storage with a database for persistent data storage.
- **Multiple Exams:** Allow users to select from different sets of exams.
## Contributing

Contributions are always welcome!
Feel free to fork this project, create a new branch, and submit a pull request for any enhancements or bug fixes.

## License

This project is licensed under the [MIT](https://github.com/manasvi711/Oasis_Infobyte/blob/main/LICENSE) License.

