#!/bin/bash

check_command() {
    command -v $1 >/dev/null 2>&1
}

# Check if Java is installed
if check_command java; then
    echo "Java is already installed."
else
    echo "Java is not installed. Installing Java..."
    sudo apt-get install default-jdk
fi

# Check if MySQL is installed
if check_command mysql; then
    echo "MySQL is already installed."
else
    echo "MySQL is not installed. Installing MySQL..."
    sudo apt-get install mysql-server
fi

# Check if Node.js and npm are installed
if check_command node && check_command npm; then
    echo "Node.js and npm are already installed."
else
    echo "Node.js and npm are not installed. Installing Node.js..."
    sudo apt-get install nodejs npm
fi


# Install required npm packages

if [ -d "./h2h_milestone_5" ]; then
    echo "Installing required npm packages..."
    npm install ./h2h_milestone_5
else
    echo "Skipping npm install..."
fi

echo -e "\e[1;32m"
echo "Setup completed successfully."
