package cap_01_31.stack;

public class  Notes {
//	Stack is a linear data structure that follows the Last In First Out (LIFO) principle.
//	Stack implements List interface and extends Vector class.
//	operations: push, pop, peek, isEmpty, search, size
//	random access is not allowed in stack
//	StackOverflowError: when stack exceeds its capacity
//	CallStack: A call stack is a stack data structure that stores information about the active subroutines of a computer program.
//	Call Stack is static in nature
//	Stack in data structure is dynamic in nature

//	Reverse Polish Notation (RPN):
//  RPN is a mathematical notation in which every operator follows all of its operands.
//  token is a number -> push it onto the stack
//	token is an operator -> pop operand2, operand1
//	operation -> operand1 operator operand2
//	push result onto the stack
//	Example: 4 6 + 5 *
//	4 -> push									[4]
//	6 -> push									[4, 6]
//	+ -> pop 6, pop 4, 4 + 6 = 10, push 10		[10]
//	5 -> push									[10, 5]
//	* -> pop 5, pop 10, 10 * 5 = 50, push 50	[50]
}
