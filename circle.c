#include <stdio.h>// to find the perimetre and area of a circle
int main()
{
	int po,io,radius;
	printf("we are going to find the perimetre and area of a circle\n");
	printf("enter the radius\n");
	scanf("%d",&radius);
io=(3.1415)*(radius*radius);
po=2*(3.1415)*(radius);
printf("the area is=%d\n",io);
printf("the perimetre is=%d\n",po);
}
