
# Smartphone Inventory Management System
## Overview
This is a simple console-based smartphone inventory management system built using Java. The system allows users to manage a list of smartphones by adding, updating, deleting, and viewing smartphone details in an inventory. The project is designed to demonstrate basic Java principles such as object-oriented programming, data encapsulation, and usage of the ArrayList for dynamic data storage.

## Project Structure

The project contains the following packages and classes:
### 1. model.SmartphoneModel

This class represents individual smartphone models in the system. It includes:
- Instance variables for model code and the quantity of six different smartphone models.
- A constructor to initialize these variables.
- Getter and setter methods for each variable to access and modify data.

### 2. controller.StoreController
This class handles the operations of adding, updating, deleting, and fetching smartphone data. It includes:
- addNewProduct: Adds a new smartphone model to the inventory using user input from the Scanner class.
- deleteProduct: Deletes a smartphone from the inventory based on the model code.
- updateProduct: Updates the details of an existing smartphone model.
- getSmartphoneInfo: Fetches and displays the details of a specific smartphone by model code.

### 3. views.StoreApp
The main class that demonstrates the usage of the system. It includes:
- A global ArrayList<SmartphoneModel> to hold the smartphone inventory.
- A main method that initializes the system and offers options to the user to add, update, delete, and view smartphone details.


## Feature
- Add New Product: Users can add a new smartphone model to the inventory by providing details such as the model code and quantities of different phone types.
- Delete Product: Users can delete a smartphone model from the inventory if it exists.
- Update Product: Users can update the details of an existing smartphone model.
- View Product Information: Users can view the details of a specific smartphone model using its model code.

