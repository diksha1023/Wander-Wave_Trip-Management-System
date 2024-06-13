# REST API for - WanderWave: Trip Management System

This application consists of APIs which perform all the fundamental CRUD operations with user validation at every step.

## Functionalities

### Customer and Admin Authentication & Validation

The application includes session UUIDs to ensure secure and authenticated interactions.

### Admin Features

- **Administrator Role**: Manages the entire application.
- **Customer Management**: Only registered admins with a valid session token can add, update, or delete customers from the main database.
- **Access Control**: Admins can access the details of different customers and their trip bookings.

### Customer Features

- **User Registration and Login**: Customers can register with the application and log in to obtain a valid session token.
- **Trip Management**: Customers can view available buses, packages, hotels, and book trips.
- **Profile Management**: Only logged-in users can access their trip history, update their profile, and utilize other features.

## Tech Stack

- **Java**
- **Spring Framework**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **Maven**
- **MySQL**

## Modules

- **Login, Logout Module**
- **Packages Module**
- **Booking Module**
- **TicketDetails Module**
- **Route Module**
- **Travels Module**
- **Bus Module**
- **Hotel Module**
- **Report Module**
- **Feedback Module**

---

## Getting Started

To run the project locally, follow these steps:

1. **Clone the repository**:
   ```sh
   git clone https://github.com/your-repo/wanderwave-trip-management.git
