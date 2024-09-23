
# Online Reservation System

## Overview

The Online Reservation System is a simple Java-based application designed to simulate a basic ticket reservation system. It includes functionality for users to log in, reserve tickets, and cancel reservations.

## Features

1. **User Authentication:** Simple login functionality using hardcoded credentials.
2. **Reservation System:** Users can reserve tickets by entering details such as name, train number, class type, journey date, and destination.
3. **Cancellation System:** Users can cancel a reservation using a valid PNR number.

## Project Structure

The project consists of three main components:
1. **Main Class (`OnlineReservationSystem.java`):** This is the entry point of the application. It manages user interaction and the main menu.
2. **User Management (`UserManager.java`):** Handles user validation and login.
3. **Reservation Management (`ReservationManager.java`):** Manages ticket reservations and cancellations.

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/online-reservation-system.git
    ```
2. Compile the Java files:
    ```bash
    javac OnlineReservationSystem.java
    ```
3. Run the program:
    ```bash
    java OnlineReservationSystem
    ```

## Examples Usage
### Login

- The user logs in using the credentials:
    - **Login ID:** `user`
    - **Password:** `password`

### Reservation
- After logging in, the user can reserve a ticket by entering the necessary details (name, train number, etc.).

### Cancellation
- The user can cancel a reservation by providing the correct PNR number.




## Improvements

- **Database Integration:** Storing user credentials and reservation details in a database.
- **Security:** Implementing secure login mechanisms and data protection.
- **Error Handling:** Adding more robust error handling throughout the application.
- **User Interface:** Enhancing the user experience with a graphical interface or web-based UI.


## Contributing

Contributions are always welcome!  
If you want to contribute to this project:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a new Pull Request.


## License

This project is licensed under the [MIT](https://github.com/manasvi711/Oasis_Infobyte/blob/main/LICENSE)  License - see the [LICENSE](LICENSE) file for details.




## Explanation

- **Overview:** Briefly describes what the project is about.
- **Features:** Lists the key functionalities of the system.
- **Project Structure:** Breaks down the main components of the project.
- **How to Run:** Instructions on how to compile and run the program.
- **Example Usage:** Demonstrates how a user would interact with the system.
- **Improvements:** Suggests potential areas for further development.
- **Contributing:** Provides guidelines for those who wish to contribute.
- **License:** Mentions the license under which the project is shared.
