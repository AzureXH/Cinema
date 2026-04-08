# Cinema Management System

A comprehensive cinema management system built with Spring Boot, providing features for movie management, ticket sales, user membership, and promotional activities.

## 📋 Project Overview

This is a full-stack web application for cinema operations management, including:
- Movie and screening schedule management
- Hall and seat management
- Ticket booking and sales
- VIP membership and coupon system
- Promotional activities and discounts
- Refund processing
- Statistics and analytics

## 🛠️ Technology Stack

- **Backend Framework**: Spring Boot 2.1.3
- **View Layer**: Thymeleaf
- **Database**: MySQL 5.7+
- **ORM**: MyBatis 1.3.2
- **Build Tool**: Maven
- **Java Version**: JDK 1.8

### Key Dependencies
- Spring Boot Starter Web
- Spring Boot DevTools (hot reload)
- Spring Boot Actuator (monitoring)
- MySQL Connector
- Commons FileUpload (file handling)
- Lombok (code simplification)

## 📁 Project Structure

```
cinema/
├── src/
│   ├── main/
│   │   ├── java/com/example/cinema/
│   │   │   ├── bl/                    # Business Logic Interfaces
│   │   │   │   ├── management/        # Movie, Hall, Schedule management
│   │   │   │   ├── promotion/         # Activity, Coupon, VIP services
│   │   │   │   ├── sales/             # Ticket sales
│   │   │   │   ├── statistics/        # Analytics
│   │   │   │   └── user/              # User account management
│   │   │   ├── blImpl/                # Business Logic Implementations
│   │   │   ├── controller/            # REST Controllers
│   │   │   ├── data/                  # Data Access Interfaces
│   │   │   ├── po/                    # Persistent Objects
│   │   │   ├── vo/                    # View Objects
│   │   │   └── CinemaApplication.java # Main Application
│   │   └── resources/
│   │       ├── application.yml        # Configuration
│   │       ├── dataImpl/              # MyBatis Mappers
│   │       ├── static/                # Static resources
│   │       └── templates/             # Thymeleaf templates
│   └── test/                          # Test files
├── sql/
│   └── cinema.sql                     # Database schema
├── pom.xml                            # Maven configuration
└── README.md                          # Project documentation
```

## 🚀 Getting Started

### Prerequisites

- JDK 1.8 or higher
- Maven 3.x
- MySQL 5.7 or higher
- IDE (IntelliJ IDEA recommended)

### Installation Steps

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd cinema
   ```

2. **Create database**
   ```bash
   mysql -u root -p
   CREATE DATABASE cinema CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
   ```

3. **Import database schema**
   ```bash
   mysql -u root -p cinema < sql/cinema.sql
   ```

4. **Configure database connection**
   
   Edit `src/main/resources/application.yml`:
   ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/cinema?serverTimezone=CTT&characterEncoding=UTF-8
       username: your_username
       password: your_password
       driver-class-name: com.mysql.cj.jdbc.Driver
   ```

5. **Build the project**
   ```bash
   mvn clean install
   ```

6. **Run the application**
   ```bash
   mvn spring-boot:run
   ```
   
   Or run the main class directly:
   ```bash
   java -jar target/cinema-0.0.1-SNAPSHOT.jar
   ```

7. **Access the application**
   
   Open your browser and navigate to: `http://localhost:8080`

## 💡 Key Features

### User Management
- User registration and login
- User profile management
- Account balance and recharge

### Movie Management
- Add/Edit/Delete movies
- Movie details and poster management
- Movie search and filtering

### Hall & Schedule Management
- Cinema hall configuration
- Seat layout management
- Screening schedule creation
- Time slot management

### Ticket Sales
- Seat selection and booking
- Real-time seat availability
- Order confirmation
- Ticket refund processing

### Promotion System
- VIP membership tiers
- Coupon creation and distribution
- Promotional activities
- Discount rules engine

### Statistics & Analytics
- Movie popularity statistics
- Sales reports
- User behavior analysis
- Revenue tracking

## 📊 Database Schema

The database includes the following main tables:
- `activity` - Promotional activities
- `activity_movie` - Activity-movie associations
- `coupon` - Coupons and discounts
- `hall` - Cinema halls
- `movie` - Movie information
- `movie_like` - User movie likes
- `refund_ticket` - Refund records
- `schedule` - Screening schedules
- `ticket` - Ticket orders
- `user` - User accounts
- `vip_card` - VIP membership

## 🔧 Configuration

### Application Configuration
Main configuration file: `src/main/resources/application.yml`

Key settings:
- Database connection
- Thymeleaf template engine
- MyBatis mapper locations
- Jackson timezone settings

### MyBatis Mapper
Mapper XML files are located in: `src/main/resources/dataImpl/`

## 🧪 Testing

Run tests with:
```bash
mvn test
```

## 📝 API Endpoints

Main controller packages:
- `/management` - Management operations
- `/promotion` - Promotional activities
- `/sales` - Ticket sales
- `/statistics` - Analytics
- `/user` - User operations

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is developed for educational purposes (SEEC2 course project).

## 👥 Authors

- Project Team - Initial work

## 🙏 Acknowledgments

- Spring Boot community
- MyBatis community
- All contributors to this project

## 📞 Support

For questions or issues, please open an issue in the repository.

---

**Note**: Remember to change the default database credentials in `application.yml` before deploying to production.
