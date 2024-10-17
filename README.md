# Kart_In - ECommerce Platform Backend

Kart_In is a Spring Boot-powered backend for a robust eCommerce platform. It offers a range of features found in popular
online shopping platforms like Amazon or Flipkart, including product management, user accounts, shopping cart, and order
management.

## Features

- **User Authentication**: Secure login/registration.
- **Product Management**: Create, update, and delete products.
- **Cart Management**: Add, update, and remove items from the cart.
- **Order Processing**: Manage user orders and track delivery status.

## Tech Stack

- **Java** (Spring Boot)
- **Hibernate/JPA** (ORM)
- **MySQL** (Database)
- **Maven** (Build Tool)
- **Spring Security** (Authentication)

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/GangadharYande/Kart_In.git
   ```
2. Set up MySQL and update the credentials in `application.properties`.
3. Run the project:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

### Product

- `GET /api/products`: List all products.
- `POST /api/products`: Create a new product.
- `PUT /api/products/{id}`: Update a product.
- `DELETE /api/products/{id}`: Delete a product.

### Cart

- `POST /api/cart/add`: Add items to the cart.
- `DELETE /api/cart/remove/{id}`: Remove an item.

### Orders

- `POST /api/orders`: Place an order.
- `GET /api/orders/{id}`: Get order details.

## Contribution



1. Fork the repository.
2. Create a feature branch.
3. Make changes and submit a pull request.


## Contributors 🍉

Thanks goes to these wonderful people ([:hugs:](https://allcontributors.org/docs/en/emoji-key)):
Contributions are welcome! If you'd like to contribute to this project, feel free to fork the repository and submit a pull request.

<table>
    <tbody>
        <tr>
            <td align="center">
                <a href="https://github.com/GangadharYande">
                    <img src="https://avatars.githubusercontent.com/u/36783781?s=400&u=c9cabc0329f1087b489d7ea95996ea53ce8d0c9f&v=4" width="100px;" alt="Gangadhar Yande"/>
                    <br />
                    <sub><b>Gangadhar Yande</b></sub>
                </a> 
            </td>
         </tr>
      </tbody>
   </table>

## License

This project is licensed under the MIT License.
