//function is a named, resuable block of code which performs a specific task

#include<stdio.h>
//function prototype or declaration
void sum();
void main() {
    //function call
    sum();
    sum();
}

//function definition
void sum() {
    int a,b;
    printf("Enter values of a and b:");
    scanf("%d%d",&a,&b);
    printf("Sum of a and b is %d",a+b);

}

