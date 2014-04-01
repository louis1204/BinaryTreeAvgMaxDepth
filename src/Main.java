import java.util.Random;


public class Main {

	public static void main(String[] args) {
		BinarySearchTree bst;
		Random rand = new Random();

		// Test 0 node
		bst = new BinarySearchTree();
		System.out.println("Leaves Count: " + bst.countLeaves(bst.root));
		System.out.println("Sum of Depths: " + bst.sumOfLeavesDepths(bst.root, 0));
		System.out.println("Max Depth: " + bst.maxDepth(bst.root, 0));
		if(bst.countLeaves(bst.root) != 0)
			System.out.println("Average Depth: " + (float)bst.sumOfLeavesDepths(bst.root,0)/(float)bst.countLeaves(bst.root) + "\n\n");
		else
			System.out.println();

		// Test 1 node
		bst = new BinarySearchTree();
		bst.insert(rand.nextFloat());
		System.out.println("Leaves Count: " + bst.countLeaves(bst.root));
		System.out.println("Sum of Depths: " + bst.sumOfLeavesDepths(bst.root, 0));
		System.out.println("Max Depth: " + bst.maxDepth(bst.root, 0));
		if(bst.countLeaves(bst.root) != 0)
			System.out.println("Average Depth: " + (float)bst.sumOfLeavesDepths(bst.root,0)/(float)bst.countLeaves(bst.root) + "\n");
		else
			System.out.println();

		// Test 100 node
		bst = new BinarySearchTree();
		for(int i = 0; i < 100; i++)
			bst.insert(rand.nextFloat());
		System.out.println("Leaves Count: " + bst.countLeaves(bst.root));
		System.out.println("Sum of Depths: " + bst.sumOfLeavesDepths(bst.root, 0));
		System.out.println("Max Depth: " + bst.maxDepth(bst.root, 0));
		if(bst.countLeaves(bst.root) != 0)
			System.out.println("Average Depth: " + (float)bst.sumOfLeavesDepths(bst.root,0)/(float)bst.countLeaves(bst.root) + "\n");
		else
			System.out.println();

		// Test 1023 node
		bst = new BinarySearchTree();
		for(int i = 0; i < 1023; i++)
			bst.insert(rand.nextFloat());
		System.out.println("Leaves Count: " + bst.countLeaves(bst.root));
		System.out.println("Sum of Depths: " + bst.sumOfLeavesDepths(bst.root, 0));
		System.out.println("Max Depth: " + bst.maxDepth(bst.root, 0));
		if(bst.countLeaves(bst.root) != 0)
			System.out.println("Average Depth: " + (float)bst.sumOfLeavesDepths(bst.root,0)/(float)bst.countLeaves(bst.root) + "\n");
		else
			System.out.println();

		// Test 1023 node
		bst = new BinarySearchTree();
		for(int i = 0; i < 1023; i++)
			bst.insert(rand.nextFloat());
		System.out.println("Leaves Count: " + bst.countLeaves(bst.root));
		System.out.println("Sum of Depths: " + bst.sumOfLeavesDepths(bst.root, 0));
		System.out.println("Max Depth: " + bst.maxDepth(bst.root, 0));
		if(bst.countLeaves(bst.root) != 0)
			System.out.println("Average Depth: " + (float)bst.sumOfLeavesDepths(bst.root,0)/(float)bst.countLeaves(bst.root) + "\n");
		else
			System.out.println();

		// Test 1023 node
		bst = new BinarySearchTree();
		for(int i = 0; i < 1023; i++)
			bst.insert(rand.nextFloat());
		System.out.println("Leaves Count: " + bst.countLeaves(bst.root));
		System.out.println("Sum of Depths: " + bst.sumOfLeavesDepths(bst.root, 0));
		System.out.println("Max Depth: " + bst.maxDepth(bst.root, 0));
		if(bst.countLeaves(bst.root) != 0)
			System.out.println("Average Depth: " + (float)bst.sumOfLeavesDepths(bst.root,0)/(float)bst.countLeaves(bst.root) + "\n");
		else
			System.out.println();

		// Test 1023 node
		bst = new BinarySearchTree();
		for(int i = 0; i < 1023; i++)
			bst.insert(rand.nextFloat());
		System.out.println("Leaves Count: " + bst.countLeaves(bst.root));
		System.out.println("Sum of Depths: " + bst.sumOfLeavesDepths(bst.root, 0));
		System.out.println("Max Depth: " + bst.maxDepth(bst.root, 0));
		if(bst.countLeaves(bst.root) != 0)
			System.out.println("Average Depth: " + (float)bst.sumOfLeavesDepths(bst.root,0)/(float)bst.countLeaves(bst.root) + "\n");
		else
			System.out.println();
	}

}
