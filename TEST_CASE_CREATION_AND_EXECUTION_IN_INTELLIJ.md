# Test Case Creation and Execution in IntelliJ (Java Project)

## 1. What is a Test Case?
A test case is a small piece of code written to check whether your program works correctly.

It works like this:
- Input: Give some data
- Expected Output: What should come
- Actual Output: What your code gives

If both match, test passes. If not, test fails.

## 2. Why Do We Write Test Cases?
- To verify your code works correctly
- To catch bugs early
- To make future changes safely

## 3. Where to Write Test Cases in IntelliJ?
Project structure:

```text
src
 |- main
 |   |- java        (your actual code)
 |- test
     |- java        (your test cases)
```

If test folder is not present:
1. Right-click src
2. Click New -> Directory
3. Name it test
4. Right-click the new test folder -> Mark Directory as -> Test Sources Root

## 4. How to Create a Test Case (Using JUnit)
### Step 1: Add JUnit Library
1. Go to File -> Project Structure
2. Click Libraries
3. Add JUnit (JUnit 5 recommended)

### Step 2: Create Test Class
1. Right-click on your class (example: TrainConsistManagementApp)
2. Click Generate -> Test
3. Select methods to test
4. Click OK

A test class is created with the same class name plus Test.
Example: TrainConsistManagementAppTest

### Step 3: Write a Simple Test Case
Use JUnit annotations and assertions.

## 5. Understanding Test Code
- @Test: Marks a test method
- assertEquals(expected, actual): Checks result

If values match, it passes. If not, it fails.

## 6. How to Run Test Cases
### Method 1: Run Single Test
1. Click the green play icon near the method
2. Click Run

### Method 2: Run Entire Test Class
1. Right-click test class
2. Click Run ClassNameTest

## 7. How to See Results
After running:
- Green: Test passed
- Red: Test failed

You can see:
- Number of tests run
- Passed and failed count
- Error details if failed

## 8. Example Output
```text
Test run finished
1 test passed
0 tests failed
```

## 9. Important Tips
- Always test both valid and invalid inputs
- Keep test cases simple and clear
- One test = one scenario

## 10. Summary
- Test cases verify your code
- Written using JUnit
- Stored in test folder
- Run using IntelliJ Run option
- Results shown instantly
