What is the need for Arrays class?

	Is an utility class to define several utility methods to for Array objects. 

How do the sort elements in Arrays objects?

	Arrays class defines the following sort methods, to sort elements of primitive and objective type arrays.

	1. public static void sort(Primitive[] p) //based on default sorting or natural sorting
	2. public static void sort(Object[] obj) //based on default sorting or natural sorting
	3. public static void sort(Object[] obj, Comparator c) //based on customized sorting

	Refer ArraySortDemo.java for more example

How do you searching elements in Array Objects?

	Arrays class defines the follow binary searching methods

	1. public static int binarySearch(primitive[] p, primitive target)
	2. public static int binarySearch(Object[] a, Object target)
	3. public static int binarySearch(Object[] a, Object target, Comparator c)

	All rules are exactly same as Collections class binarySearch methods.


How do you convert array to list?

	asList() method 
	
	public static List asList(Object[] a)

	Strictly speaking the method won’t create an independent list object, for the existing array we are getting list view.

	By using array reference if we perform any change, automatically the change will be reflected to the list and vice versa.

	If we try to perform any operation which changes the size the underlying operation, immediately we will get UnsupportedOperationException 

	If we try to change the underlying array element using heterogeneous elements, immediately we will get ArrayStoreException
