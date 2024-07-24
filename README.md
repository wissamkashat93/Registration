# Registration Project

The Registration Project is a Java-based application designed to manage and track vehicle registrations. It includes features for adding, sorting, and filtering car owner information based on registration dates.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Features](#features)
- [Contributing](#contributing)
- [License](#license)

## Installation

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A text editor or Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or VSCode

### Steps

1. **Clone the repository:**

    ```bash
    git clone https://github.com/wissamkashat93/RegistrationProject.git
    cd RegistrationProject
    ```

2. **Compile the Java files:**

    ```bash
    javac -d bin src/*.java
    ```

3. **Run the application:**

    ```bash
    java -cp bin Main
    ```

## Usage

The application allows users to manage car owner registrations. It includes functionalities to add new car owners, sort the list based on registration dates, and filter owners based on their registration status.

### Sample Output

```
Initial Set of Car Owners - Unsorted
Bugs Bunny          	ABC-123		    5/2021         
Honey Bunny         	DEF-456		    9/2021         
Lola Bunny          	GHI-789		    3/2022         
Daffy Duck          	JKL-123		    3/2022         
Melissa Duck        	MNQ-456		    2/2022         
Foghorn Leghorn     	RST-789		    7/2021         
Elmer Fudd          	UVW-123		    2/2022         
Speedy Gonzales     	XYZ-456		    4/2021         
Marvin Martian      	BCD-789		    6/2021         
Pepe Le Pew         	EFG-123		    9/2021         
Petunia Pig         	HIJ-456		    8/2021         
Porky Pig           	KLM-789		    2/2022         
Sylvester Cat       	NQR-456		    1/2021         
Tasmanian Devil     	STU-789		    10/2020        
Tweety Bird         	VWX-123		    8/2021         
Wyle Coyote         	YZA-456		    2/2022         
Road Runner         	CDE-789		    5/2022         
Yosemite Sam        	FGH-123		    3/2021         

Sorted list based on Registration date
Tasmanian Devil     	STU-789		    10/2020        
Sylvester Cat       	NQR-456		    1/2021         
Yosemite Sam        	FGH-123		    3/2021         
Speedy Gonzales     	XYZ-456		    4/2021         
Bugs Bunny          	ABC-123		    5/2021         
Marvin Martian      	BCD-789		    6/2021         
Foghorn Leghorn     	RST-789		    7/2021         
Petunia Pig         	HIJ-456		    8/2021         
Tweety Bird         	VWX-123		    8/2021         
Honey Bunny         	DEF-456		    9/2021         
Pepe Le Pew         	EFG-123		    9/2021         
Melissa Duck        	MNQ-456		    2/2022         
Elmer Fudd          	UVW-123		    2/2022         
Porky Pig           	KLM-789		    2/2022         
Wyle Coyote         	YZA-456		    2/2022         
Lola Bunny          	GHI-789		    3/2022         
Daffy Duck          	JKL-123		    3/2022         
Road Runner         	CDE-789		    5/2022         

Owners with Expired Registration
Tasmanian Devil     	STU-789		    10/2020        
Sylvester Cat       	NQR-456		    1/2021         
Yosemite Sam        	FGH-123		    3/2021         

Owners with registration expiring in three months or less
Speedy Gonzales     	XYZ-456		    4/2021         
Bugs Bunny          	ABC-123		    5/2021         
Marvin Martian      	BCD-789		    6/2021         
```

## Project Structure

The project structure is as follows:

```
RegistrationProject/
├── bin/
│   ├── CarOwner.class
│   ├── CarOwnerInterface.class
│   ├── Citizen.class
│   ├── CitizenInterface.class
│   ├── Main.class
│   ├── RegistrationMethods.class
│   ├── RegistrationMethodsInterface.class
├── src/
│   ├── CarOwner.java
│   ├── CarOwnerInterface.java
│   ├── Citizen.java
│   ├── CitizenInterface.java
│   ├── Main.java
│   ├── RegistrationMethods.java
│   ├── RegistrationMethodsInterface.java
├── data/
│   ├── binFile.dat
│   ├── output.txt
│   ├── registration.csv
├── replit.nix
```

### Key Files

- `CarOwner.java`: Defines the CarOwner class.
- `CarOwnerInterface.java`: Defines the interface for CarOwner.
- `Citizen.java`: Defines the Citizen class.
- `CitizenInterface.java`: Defines the interface for Citizen.
- `Main.java`: Contains the main method to run the application.
- `RegistrationMethods.java`: Defines the methods for handling registration logic.
- `RegistrationMethodsInterface.java`: Defines the interface for registration methods.
- `binFile.dat`: A binary data file for storing serialized objects.
- `output.txt`: An output file containing sample results.
- `registration.csv`: A CSV file containing registration data.

## Features

- Add new car owners.
- Sort car owners based on registration dates.
- Filter car owners based on registration status.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue to discuss your ideas.

### Steps to Contribute

1. Fork the repository.
2. Create a new branch: `git checkout -b my-feature-branch`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin my-feature-branch`
5. Submit a pull request.

