"# 24252-Final-Project-Web-Tech" 

!! First of all to run the Application, you need to include a Username and Password:
(admin as Username and admin as Password) This is the Spring Security implemented in order to prevent unauthorized users to access the system.

Project Requirements & Project Scope
====================================

1. Project Requirements:
   --------------------
   
- Purpose of the Project:

The Blood Donation Management System aims to establish an efficient and transparent 
process for managing blood donors and requests within a donation center. The primary 
purpose is to bridge the gap between individuals in need of blood and willing donors by
creating a centralized system managed by administrators.

- Expected Outcomes:
a. Streamlined Donor Management: Enable administrators to register donors physically 
at the donation center, maintaining accurate and up-to-date donor profiles.

b. Effective Blood Request Handling: Facilitate the process of managing and fulfilling 
user blood requests in a timely manner.

c. Enhanced Communication: Provide a reliable communication system between 
administrators, donors, and users, ensuring prompt notifications and updates.

d. Optimized Inventory Management: Efficiently track and manage the blood inventory 
to meet demand and prevent shortages.

e. User-Friendly Interface: Develop a user-friendly interface for administrators to easily 
navigate and manage donor information and blood requests.

- Constraints and Limitations:

Physical Registration: Donors must be registered manually by administrators after their 
physical presence at the donation center.
Limited Donor Information: Administrators will rely on the information provided by donors 
during the manual registration process.
Real-time Communication: The system should provide real-time communication for 
immediate notifications but may be subject to external factors like network availability.

2. Project Plan:
   -------------
- Scope of the Project:

The project scope encompasses the development of a Blood Donation Management System 
with the following key features:
- Donor Management by Administrators
- User Blood Request Management
- Administrator Dashboard for Oversight
- Communication System for Notifications
- Blood Inventory Management
  
- Timeline:

Week 1: Project Setup and Planning
- Define project requirements and scope.
- Choose and set up the development environment.
Week 2: Backend Development
- Tools and Technologies: Spring MVC, Java Programming.
Week 3: Frontend Development:
- Tools and Technologies: HTML, CSS, JavaScript
- Submission on GitHub

  Technical Documentation:
  =======================

This technical documentation provides an overview of the architecture, implementation details, libraries/frameworks used, and other technical aspects of the Blood Donation 
Management System. Developers and administrators can refer to this documentation for a comprehensive understanding of the system's technical foundation and functionality.

1. Architecture:
The Blood Donation Management System is designed as a client-server application, following a three-tier architecture.

a. Presentation tier:
  • The frontend is implemented using HTML to create a responsive and interactive user interface.
  • CSS with the usage of thymeleaf is used for styling to ensure a clean and consistent design.

b. Application Tier:
  • The backend is built using Spring MVC framework to create a robust and scalable server.
  • Java Programming is used to implement the Spring Framework.
  
c. Data Tier:
  • My application is using MySQL as the database management system to store and retrieve donor, admin, and request information.
  
3. Implementation Details:
   
a. User Authentication:
  • Passwords authentication and authorization are implemented using JavaScript.
  
b. Donor Registration:
  • Donors are manually registered by administrators through a dedicated interface, where essential details are collected and stored in the database.
  
c. Blood Request Management:
  • Blood requests are stored in the database with relevant details such as blood type, Full Names, Addresses, etc...
  • Administrators can efficiently match donors with specific blood types to incoming requests.
5. Libraries/Frameworks:
a. Frontend:

  • CSS
  • HTML
  • JavaScript
  
b. Backend:

  • Spring MVC
  • Java Programming
  
c. Database:
  • MySQL as Database


