## Wildlife Tracker Website

This is a site that enables rangers to track wildlife sightings in the area , 07/11/2021.

By Khajira Christopher

## Description
This is a ranger website that allows the user to report any sightings of wildlife in the area. The site allows the user
to fill a form that contains the name, health, age and location in which the animal has been spotted. The form also allows 
the ranger to fill his name. The site allows the user to see all the wildlife that has been spotted and the date which they were
spotted.  
 

## Behaviour Driven Development
1.  Displays Homepage and button to add new sighting
   - INPUT: "Click button to direct to add new sighting"
   - OUTPUT: "Redirected to add new sighting page"
2.  Displays form to add a new sighting
   - INPUT: "Form requiring name, age, health, location and ranger name"
   - OUTPUT: "The sighting is created"
3.  Displays option to view all sightings
   - INPUT: "Button to redirect to all sightings"
   - OUTPUT: "Displays the details of all sightings that have been reported including the 
   time seen, name, age, health, location and ranger name"
    
## Setup/Installation Requirements

1. Clone the project using git clone https://github.com/Ckhajira/forest-service. If you are not able to clone it, you can download the files as a zip folder

2. Ensure that you have the complete file

3. Navigate to IntelliJ IDEA or your favorite IDEA and automatically install the required dependencies using Gradle

4. Build and run the project

## Database Commands
1. CREATE DATABASE wildlife-tracker;
2. \c wildlife-tracker;
3. CREATE TABLE animals (id serial PRIMARY KEY, name text, danger text, health text, age text, location text, ranger text, created timestamp);
4. CREATE TABLE sightings (id serial PRIMARY KEY, animal id int, location text, rangername text, lastsighting timestamp);

## Test Database Setup
1. CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;

## Technologies Used
This project uses HTML and CSS for frontend.
Java for backend

## Dependencies
Gradle: distributionUrl=https\://services.gradle.org/distributions/gradle-5.2.1-all.zip

testImplementation 'org.junit.jupiter:junit-jupiter-api:5.3.1'

testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.3.1'

## Support and contact details

If you have any issues or questions, you can get intouch with me through email: christopher.khajira@student.moringaschool.com. Please feel free to make any contributions to the code.

## License

MIT License
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Copyright (c) 2021 Khajira Christopher