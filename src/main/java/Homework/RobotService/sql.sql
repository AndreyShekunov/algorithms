CREATE TABLE Robot (
        id INT PRIMARY KEY,
        name VARCHAR(255),
        serialNumber VARCHAR(255)
        );

        CREATE TABLE Room (
        id INT PRIMARY KEY,
        name VARCHAR(255),
        area INT
        );

        CREATE TABLE CleaningSchedule (
        id INT PRIMARY KEY,
        roomId INT,
        robotId INT,
        startTime TIMESTAMP
        );
