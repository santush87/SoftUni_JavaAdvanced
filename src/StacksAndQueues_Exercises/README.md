<h2>1.	Reverse Numbers with a Stack</h2>
<p>Write a program that reads N integers from the console and reverses them using a stack. Use the ArrayDeque<Integer> class. Just put the input numbers in the stack and pop them.</p>
<h3>Examples</h3>

![Screenshot_1](https://user-images.githubusercontent.com/73018624/178225983-06b57aee-1ff8-4c26-a83e-035473ad138c.jpg)

<h2>2.	Basic Stack Operations</h2>
<p>You will be given an integer N representing the number of elements to push into the stack, an integer S representing the number of elements to pop from the stack, and finally an integer X, an element that you should check whether is present in the stack. If it is, print "true" on the console. If it’s not, print the smallest element currently present in the stack.</p>

<h3>Input</h3>
<p>•	On the first line, you will be given N, S, and X separated by a single space. </p>
<p>•	On the next line, you will be given a line of numbers separated by one or more white spaces.</p>

<h3>Output</h3>
<p>•	On a single line print, either "true" if X is present in the stack, otherwise print the smallest element in the stack.</p>
<p>•	If the stack is empty – print 0.</p> 

<h3>Examples</h3>

![Screenshot_2](https://user-images.githubusercontent.com/73018624/178226762-243d2001-5fc9-47fe-a62f-bf3b90ba835d.jpg)


<h2>3.	Maximum Element</h2>
<p>You have an empty sequence, and you will be given N commands. Each command is one of the following types:</p>
<p>•	"1 X" - Push the element X into the stack.</p>
<p>•	"2" - Delete the element present at the top of the stack.</p>
<p>•	"3" - Print the maximum element in the stack.</p>

<h3>Input</h3>
<p>•	The first line of input contains an integer N, where 1 ≤ N ≤ 105.</p>
<p>•	The next N lines contain commands. All commands will be valid and in the format described.</p>
<p>•	The element X will be in the range 1 ≤ X ≤ 109.</p>
<p>•	The type of the command will be in the range 1 ≤ Type ≤ 3.</p>

<h3>Output</h3>
<p>•	For each command of type "3", print the maximum element in the stack on a new line.</p>
<h3>Examples</h3>

![Screenshot_3](https://user-images.githubusercontent.com/73018624/178227529-7eb1d487-d004-40a4-8654-630d22a7e82c.jpg)



<h2>4.	Basic Queue Operations</h2>
<p>You will be given an integer N representing the number of elements to enqueue (add), an integer S representing the number of elements to dequeue (remove/poll) from the queue, and finally an integer X, an element that you should check whether is present in the queue. If it is - prints true on the console, if it is not - print the smallest element currently present in the queue.</p>

<h3>Examples</h3>

![Screenshot_4](https://user-images.githubusercontent.com/73018624/178227757-1e302702-9426-4198-af7e-a15568fdebc1.jpg)

<h2>5.	Balanced Parentheses</h2>
<p>Given a sequence consisting of parentheses, determine whether the expression is balanced. A sequence of parentheses is balanced if every open parenthesis can be paired uniquely with a closing parenthesis that occurs after the former. Also, the interval between them must be balanced.
You will be given three types of parentheses: (, {, and [.
</p>
<p>{[()]} - This is a balanced parenthesis.</p>
<p>{[(])} - This is not a balanced parenthesis.</p>

<h3>Input</h3>
<p>•	Each input consists of a single line, the sequence of parentheses.</p>
<p>•	1 ≤ Length of sequence ≤ 1000.</p>
<p>•	Each character of the sequence will be one of the following: {, }, (, ), [, ].</p>

<h3>Output</h3>
<p>•	For each test case, print on a new line "YES" if the parentheses are balanced. Otherwise, print "NO".</p>

<h3>Examples</h3>

![Screenshot_5](https://user-images.githubusercontent.com/73018624/178232118-fd04bfc1-430c-431b-bf60-0ba205d155a8.jpg)


<h2>6.	Recursive Fibonacci</h2>
<p>Each member of the Fibonacci sequence is calculated from the sum of the two previous members. The first two elements are 1, 1. Therefore, the sequence goes like 1, 1, 2, 3, 5, 8, 13, 21, 34… </p>
<p>The following sequence can be generated with an array, but that’s easy, so your task is to implement it recursively.</p>
<p>If the function getFibonacci(n) returns the nth Fibonacci number, we can express it using getFibonacci(n) = getFibonacci(n-1) + getFibonacci(n-2).</p>
<p>However, this will never end and in a few seconds, a Stack Overflow Exception is thrown. For the recursion to stop, it has to have a "bottom". The bottom of the recursion is getFibonacci(1), and should return 1. The same goes for getFibonacci(0).</p>

<h3>Input</h3>
<p>•	On the only line in the input, the user should enter the wanted Fibonacci number N where 1 ≤ N ≤ 49.</p>

<h3>Output</h3>
<p>•	The output should be the nth Fibonacci number counting from 0.</p>
<h3>Examples</h3>

![Screenshot_6](https://user-images.githubusercontent.com/73018624/178232693-addc0342-439e-44b0-bafa-724162476fdf.jpg)


