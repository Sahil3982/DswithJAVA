#include"stdio.h"
void arr1D(int base[])
{
    int k;
    printf("value:");
    scanf("%d",&k);
    int w=sizeof(int);
    unsigned int b=&base[0];
    int location=b+w*k;
    printf("Location:%d",location);
    
}
void arr2D(int a[][],int i,int j)
{
    int k;
    printf("value:");
    scanf("%d",&k);
    int w=sizeof(int);
    unsigned int b=&a[0][0];
    int l,u;
    printf("Enter lower and upper bound");
    scanf("%d%d",&l,&u);
    char ch2;
    printf("Enter row(i) and column(j)");
    scanf("%c",&ch2);
    switch(ch2)
    {
        case 'i':
         int n=u-l+1;
        int location=b+w[n(i-u)+(j-l)];
        printf("%d",location);

    break;
        case 'j':
        int m=u-l+1;
        int location1=b+w[m(i-u)+(j-l)];
        printf("%d",location1);

    break;

default:
printf("This is not right entery");
    break;
    }
}
void main()
{

int arr[]={2,3,4,5,6};
int row=3,col=3;
int arr1[row][col]={9,6,4,4,3,4,6};
printf("Menu:\n");
printf("Press 1 for 1D Array\n");
printf("Press 2 for 2D Array\n");
int ch;
printf("Enter Your Choice\n");
scanf("%d",&ch);
switch (ch)
{
case 1:
arr1D(arr);
    break;
case 2:
arr2D(arr1,row,col);
    break;

default:
printf("This is not right entery");
    break;
}

}
