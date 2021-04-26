#!/usr/bin/env python
# coding: utf-8

# ## Question 1:  Convert class object to JSON in Python using required packages.
# 

# In[7]:


#importing json package
import json

#Creating a class Employee
class Employee:
    def __init__(self, empId, empName, empDesignation, empDepartment):
        self.empId = empId
        self.empName = empName
        self.empDesignation = empDesignation
        self.empDepartment = empDepartment




# Main Function
if __name__ == "__main__":
    
    #Taking input from user about the empolyee.
    inputEmp1 = input("Enter the Employee Id,Employee Name,Employee Designation,Employee Department: ").split(",")
   
    inputEmp2 = input("Enter the Employee Id,Employee Name,Employee Designation,Employee Department: ").split(",")
   
    inputEmp3 = input("Enter the Employee Id,Employee Name,Employee Designation,Employee Department: ").split(",")
    
    inputEmp4 = input("Enter the Employee Id,Employee Name,Employee Designation,Employee Department: ").split(",")
    
    #creating object of Employee Class with defined paramenters
    empOne = Employee(int(inputEmp1[0]),inputEmp1[1],inputEmp1[2],inputEmp1[3])
    
    empTwo = Employee(int(inputEmp2[0]),inputEmp2[1],inputEmp2[2],inputEmp2[3])
    
    empThree = Employee(int(inputEmp3[0]),inputEmp3[1],inputEmp3[2],inputEmp3[3])
    
    empFour = Employee(int(inputEmp4[0]),inputEmp4[1],inputEmp4[2],inputEmp4[3])
    
    #Converting class objects into the JSON format by calliing dumps() funciton.
    jsonObjectOne = json.dumps(empOne.__dict__)
    jsonObjectTwo = json.dumps(empTwo.__dict__)
    jsonObjectThree = json.dumps(empThree.__dict__)
    jsonObjectFour = json.dumps(empFour.__dict__)
    
    
    #Printing the converted values.
    print("**************************************Class Objects to JSON*********************************************")
    print(jsonObjectOne)
    print(jsonObjectTwo)
    print(jsonObjectThree)
    print(jsonObjectFour)
    
        


# In[9]:


"""{"empId": 1470, "empName": "Durgesh Gupta", "empDesignation": " Intern", "empDepartment": " Engineering"}
{"empId": 1468, "empName": " Praanav Bhowmik", "empDesignation": "Intern", "empDepartment": "Engineering"}
{"empId": 1451, "empName": "Tanishka Garg", "empDesignation": "Intern", "empDepartment": "Engineering"}
{"empId": 1447, "empName": "Nikhil Varghese", "empDesignation": "Intern", "empDepartment": "Engineering"}
"""


# ## Question 2: Convert CSV to JSON using Python using required packages.

# In[41]:


# importing tkinter library to create GUI
import tkinter as tk
from tkinter import filedialog
from tkinter import messagebox
#importing json and csv
import json
import csv

#initializing
head = tk.Tk()

#creating the canvas of the Tool
canvas = tk.Canvas(head, width = 500, height = 500, bg= 'light cyan', relief = 'raised')
canvas.pack()

#creating label heading.
labelHead = tk.Label(head, text='\tCSV TO JSON CONVERTER', bg = 'light cyan')
labelHead.config(font=('Arial', 25 ))

#determining the window size of heading
canvas.create_window(200, 75, window = labelHead)

# creating a global dictionary that will store the data read from CSV file.
dataDictionary = {}


# fuction to select CSV file and read the data.
def readFromCSV ():
    
    pathOfCSV = filedialog.askopenfilename()
    with open(pathOfCSV, encoding='utf-8') as csvfile:
        readerCSV = csv.DictReader(csvfile)
        
        for row in readerCSV:
            key = row['No.']
            dataDictionary[key] = row

#creating a button which will call the readFromCSV function.
buttonToOpenCSV = tk.Button(text= '  CHOOSE CSV FILE  ', command = readFromCSV, bg='OliveDrab1', fg='black', font=('Arial', 15, 'bold'))
canvas.create_window(200, 160, window = buttonToOpenCSV)


# function to write the data to the JSON file.
def writeToJSON ():
    
    pathOfJSON = filedialog.asksaveasfilename(defaultextension='.json')
    with open(pathOfJSON, 'w', encoding = 'utf-8') as jsonfile:
        jsonfile.write(json.dumps(dataDictionary, indent=4))



# creating button which will call the writeToJSON function.
buttonToSaveJSON = tk.Button(text= '  CONVERT CSV TO JSON  ', command = writeToJSON, bg='OliveDrab1', fg='black', font=('Arial', 15, 'bold'))
canvas.create_window(200,210,window = buttonToSaveJSON)

# function to quit the application with a warning dialog box.
def quitApplication():
    warningBox = tk.messagebox.askquestion('Quit Application', 'Are you sure you want to quit.', icon = 'warning')
    if warningBox == 'yes':
        head.destroy()

# creating button to quit the application
buttonToQuit = tk.Button(text= '  QUIT APPLICATION  ', command = quitApplication, bg='red', fg='black', font=('Arial', 15, 'bold'))
canvas.create_window(200,260,window = buttonToQuit)

#to run the tkinter event loop unitill the application is closed by the user.            
head.mainloop()


# ## Question 3 : Python Program for Binary Search (Recursive and Iterative).

# ### Interative Approach to Implement Binary Search. 

# In[55]:


# function to Implement Binary Search using Iterative Approach.
def iterativeBinarySearch(inputList,itemToBeSearched):
    
    # setting the value of starting index to zero.
    startIndex = 0
    
    # setting the value of end index to the length of array - 1.
    endIndex = len(inputList)-1
    
    # setting the value of mid index to zero.
    midIndex=0
    
    # while loop to iterate over the list. 
    while (startIndex<=endIndex):
        
        # defining the midIndex value.
        midIndex= (endIndex+startIndex)//2
        
        # If item to be searched is greater, Then ignore the left half.
        if(inputList[midIndex]< itemToBeSearched):
            startIndex = midIndex+1
            
        # If item to be searched is smaller, Then ignore the right half.
        elif(inputList[midIndex]> itemToBeSearched):
            endIndex = midIndex-1
            
        
        # item is found at the mid , return the index.
        else:
            return midIndex
        
    # If the item is not present in the list, then return -1.
    return -1
            
        

# Main function. 
if __name__ == "__main__":
    
    # Taking input list from the user.
    inputList = list(map(int,input("Enter the elements of the list: ").split( )))
    
    # Input of element to be searched.
    itemToBeSearched= int(input("Enter the item to be searched: "))
    
    # checking the list is sorted or not.
    # if the list is not sorted.
    if(inputList != sorted(inputList)):
        
        print("The input list is not sorted. Don't worry We will do that for you.")
        # sorting the list.
        inputList.sort()
        print("After sorting the list will be: ",inputList)
        # calling the function iterativeBinarySearchTree.
        output = iterativeBinarySearch(inputList,itemToBeSearched)
    
    #if the list is sorted.
    else:
        
        #calling the function iterativeBinarySearchTree.
        output = iterativeBinarySearch(inputList,itemToBeSearched)
    
    # checking the output.
    # if the value of output is -1. Then item is not present in the list.
    if(output == -1):
        print("The Element is not present in the list.")
    
    # printing the index at which the element is present.
    else:
        print("The Element is present at index:", output)
        
        
        


# ### Recursive Approach To Implement Binary Search Tree

# In[56]:


# function to Implement Binary Search using Iterative Approach.
def recursiveBinarySearch(inputList,startIndex,endIndex,itemToBeSearched):

    
    if(endIndex>=startIndex):
        
        # defining the midIndex value.
        midIndex= (endIndex+startIndex)//2
        
        # If item to be searched is greater, Then item will be in the right subarray.
        if(inputList[midIndex]< itemToBeSearched):
            return recursiveBinarySearch(inputList,midIndex+1,endIndex,itemToBeSearched)
            
        # If item to be searched is smaller, Then item will be in the left subarray.
        elif(inputList[midIndex]> itemToBeSearched):
            endIndex = midIndex-1
            return recursiveBinarySearch(inputList,startIndex,midIndex-1,itemToBeSearched)
            
        
        # item is found at the mid , return the index.
        else:
            return midIndex
        
    # If the item is not present in the list, then return -1.
    return -1
            
        

# Main function. 
if __name__ == "__main__":
    
    # Taking input list from the user.
    inputList = list(map(int,input("Enter the elements of the list: ").split( )))
    
    # Input of element to be searched.
    itemToBeSearched= int(input("Enter the item to be searched: "))
    
    # checking the list is sorted or not.
    # if the list is not sorted.
    if(inputList != sorted(inputList)):
        
        print("The input list is not sorted. Don't worry We will do that for you.")
        # sorting the list.
        inputList.sort()
        print("After sorting the list will be: ", inputList)
        # calling the function iterativeBinarySearchTree.
        output = recursiveBinarySearch(inputList,0,len(inputList)-1,itemToBeSearched)
    
    #if the list is sorted.
    else:
        
        #calling the function iterativeBinarySearchTree.
        output = recursiveBinarySearch(inputList,0,len(inputList)-1,itemToBeSearched)
    
    # checking the output.
    # if the value of output is -1. Then item is not present in the list.
    if(output == -1):
        print("The Element is not present in the list.")
    
    # printing the index at which the element is present.
    else:
        print("The Element is present at index:", output)


# ## Question 4: Python program to find Indices of Overlapping Substrings. 

# In[59]:


# Importing the regular expression module.
import re

# function which will return the list containing the indices at which the substrings are overlapped.
def findIndicesOfSubstrings(overlappedString, stringPattern):
    
    # finding the list of indices using list comprehesion, finditer function, and escape function from re module.
    overlappedIndices = [iterator.start() for iterator in re.finditer('(?={0})'.format(re.escape(stringPattern)),overlappedString)]
    
    #returning the list containing the output indices. 
    return overlappedIndices

# Main function
if __name__ == "__main__":
    
    # taking input overlapped string from user.
    overlappedString = input("Enter the overlapped String: ")
    
    # taking input pattern string from the user.
    stringPattern = input("Entert the pattern: ")
    
    # Checking the input strings.
    # if the any of the input string either overlapped or pattern is empty.
    # then it will print invalid string.
    if(len(overlappedString)== 0 or len(stringPattern)==0):
        print("Kindly enter valid string..")
    
    # if the string is valid.
    else:
        
        # Calling the findIndicesOfSubstrings function
        output = findIndicesOfSubstrings(overlappedString, stringPattern)
        
        #Displaying the output.
        print(output)
        


# In[ ]:


# function to count the Even and Odd numbers present in the list.
def countOfEvenAndOdd(inputList):
    
    # filtering the list of even numbers from the input list using lambda function.
    countOfEven = len(list(filter(lambda element: (element % 2 == 0),inputList)))
    
    # filtering the list of odd numbers from the input list using lambda function.
    countOfOdd = len(list(filter(lambda element: (element % 2 != 0),inputList)))
    
    # returning a tuple consisting of count of Even and Odd number in the input list.
    return countOfEven, countOfOdd

# Main Function
if __name__ == "__main__":
    
    # taking list as a input from the user.
    inputList= list(map(int,input().split( )))
    
    # checking the input list is valid or not.
    # if the length of the list is 0 then it will be in valid.
    if(len(inputList)==0):
        print("List is empty")
        
    # if the length of the list is valid.
    else:
        
        # calling the function countOfEvenAndOdd.
        countOfEven, countOfOdd = countOfEvenAndOdd(inputList)
        
        # displaying the output.
        print("The count of Even numbers in the list is: ", countOfEven)
        print("The count of Odd numbers in the list is: ", countOfOdd)




