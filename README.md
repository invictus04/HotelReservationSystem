# Hotel Reservation System 🏨

Welcome to the Hotel Reservation System! This Java-based application is designed to streamline hotel reservation management, whether you're managing a small inn or a boutique hotel. With this system, you can simplify the reservation process, enhance guest management, and keep your business organized.

## Features 🌟

- **Reserve a Room:** Easily make new reservations by providing guest details, room numbers, and contact information.
- **View Reservations:** Get a comprehensive overview of all current reservations, including guest names, room numbers, contact details, and reservation dates.
- **Edit Reservation Details:** Update guest names, room numbers, and contact information for existing reservations.
- **Delete Reservations:** Remove reservations that are no longer needed with ease.

## Getting Started 🚀

### Prerequisites

- Java Development Kit (JDK)
- MySQL Database
- MySQL Connector/J (Java)

### Setup

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/prabhatthakuryt/Hotel-Reservation-System.git
    ```

2. **Configure Database Settings:**
    
    Open the `HotelReservationSystem.java` file and update the database settings:

    ```java
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";
    ```

3. **Compile and Run:**

    Compile and run the application using your preferred IDE or command line tools.

    ```bash
    javac Main.java
    java Main
    ```

## Usage 📋

Upon running the application, you'll be presented with a menu to choose your desired operation:

- **Reserve a Room**
- **View Reservations**
- **Edit Reservation Details**
- **Delete Reservations**
- **Exit**

Follow the on-screen prompts to input reservation details, view current reservations, edit existing bookings, and more.

## Contributing 🤝

We welcome contributions! Feel free to open issues and pull requests for bug fixes, enhancements, or new features.

## Acknowledgments 🙏

Special thanks to all contributors and supporters of the Hotel Reservation System project. Your efforts are greatly appreciated!

Happy booking! 🌆
