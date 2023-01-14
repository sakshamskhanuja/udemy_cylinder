## Cylinder

### Description

1. Write a class with the name <b>Circle</b>. The class needs one field (instance variable) with name <b>radius</b> of type <b>double</b>. The class needs to have one constructor with parameter <b>radius</b> of type <b>double</b> and it needs to initialize the fields. In case the <b>radius</b> parameter is less than 0 it needs to set the <b>radius</b> field value to 0.<br><br>Write the following methods (instance methods):

<ul>
<li>Method named <b>getRadius</b> without any parameters, it needs to return the value of <b>radius</b> field.</li>
<li>Method named <b>getArea</b> without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use <b>Math.PI</b> constant.</li>
</ul>

2. Write a class with the name <b>Cylinder</b> that extends <b>Circle</b> class. The class needs one field (instance variable) with name <b>height</b> of type <b>double</b>. The class needs to have one constructor with two parameters <b>radius</b> and <b>height</b> both of type <b>double</b>. It needs to call parent constructor and initialize a <b>height</b> field. In case the height parameter is less than 0 it needs to set the height field value to 0.<br><br>Write the following methods (instance methods):

<ul>
<li>Method named <b>getHeight</b> without any parameters, it needs to return the value of <b>height</b> field.</li>
<li>Method named <b>getVolume</b> without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.</li>
</ul>

### Test Code

    Circle circle = new Circle(3.75);
    System.out.println("circle.radius= " + circle.getRadius());
    System.out.println("circle.area= " + circle.getArea());
    Cylinder cylinder = new Cylinder(5.55, 7.25);
    System.out.println("cylinder.radius= " + cylinder.getRadius());
    System.out.println("cylinder.height= " + cylinder.getHeight());
    System.out.println("cylinder.area= " + cylinder.getArea());
    System.out.println("cylinder.volume= " + cylinder.getVolume());
 
 ### Output

    circle.radius= 3.75
    circle.area= 44.178646691106465
    cylinder.radius= 5.55
    cylinder.height= 7.25
    cylinder.area= 96.76890771219959
    cylinder.volume= 701.574580913447
