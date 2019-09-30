What is Collection(I)?

	1. If we want to represent object as a group of individual object as a single entity, then we should go for Collection
	2. It defines the most common methods which are applicable to any collection object

		Common methods:

			boolean add(Object obj)
			boolean addAll(Collection c)
			boolean remove(Object obj)
			boolean removeAll(Collection c)
			void clear()
			boolean retainAll(Collection c)
			boolean contains(Object obj)
			boolean containsAll(Collection c)
			boolean isEmpty()
			int size()
			Object[] toArray()
			Iterator iterator()

	3. In general collection interface is consider as root interface of collection framework.

	There is no concrete class with implements collection interface directly.

What is the need for List(I)?

	List is the child interface of collection, if we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion order must be preserved, then we should go for List(I).

How the insertion order is preserved in List(I)?

	Insertion order is preserved based on index. We can differentiate duplicate objects using index. 

Which method alone present in List interface?

	l.add(int index, Object o)
	l.addAll(int index, Collection c)
