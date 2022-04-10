
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node7 = aVLTree0.find((int)(byte)100);
    aVLTree0.delete((int)'#');
    aVLTree0.delete(10);
    aVLTree0.delete((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(2);
    aVLTree0.delete((int)'a');
    aVLTree0.delete((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.insert((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    int i10 = aVLTree3.height();
    AVLTree.Node node12 = aVLTree3.find((int)(short)-1);
    AVLTree.Node node14 = aVLTree3.find((int)'#');
    AVLTree.Node node16 = aVLTree3.find((int)(byte)-1);
    aVLTree3.delete(100);
    AVLTree.Node node19 = aVLTree3.getRoot();
    int i20 = aVLTree0.getBalance(node19);
    int i21 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node24 = null;
    int i25 = aVLTree0.getBalance(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.delete((int)(short)10);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    AVLTree.Node node27 = aVLTree20.getRoot();
    int i28 = aVLTree17.getBalance(node27);
    int i29 = aVLTree0.getBalance(node27);
    AVLTree.Node node30 = aVLTree0.getRoot();
    AVLTree.Node node32 = aVLTree0.find((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node36 = aVLTree0.find(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    int i10 = aVLTree0.height();
    AVLTree.Node node11 = aVLTree0.getRoot();
    int i12 = aVLTree0.height();
    AVLTree.Node node14 = aVLTree0.find((int)' ');
    int i15 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    aVLTree0.insert((int)(byte)1);
    AVLTree.Node node11 = aVLTree0.getRoot();
    int i12 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    AVLTree.Node node21 = aVLTree16.getRoot();
    AVLTree.Node node22 = aVLTree16.getRoot();
    int i23 = aVLTree0.getBalance(node22);
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree26 = new AVLTree();
    aVLTree26.delete((int)(short)1);
    AVLTree.Node node30 = aVLTree26.find((int)(byte)0);
    int i31 = aVLTree26.height();
    AVLTree aVLTree32 = new AVLTree();
    AVLTree.Node node33 = null;
    int i34 = aVLTree32.getBalance(node33);
    AVLTree.Node node36 = aVLTree32.find((int)'4');
    aVLTree32.insert(0);
    AVLTree.Node node39 = aVLTree32.getRoot();
    AVLTree.Node node40 = aVLTree32.getRoot();
    aVLTree32.insert((int)(byte)1);
    aVLTree32.delete(100);
    AVLTree.Node node45 = aVLTree32.getRoot();
    int i46 = aVLTree26.getBalance(node45);
    int i47 = aVLTree26.height();
    aVLTree26.delete((int)(short)-1);
    aVLTree26.insert((int)'a');
    AVLTree.Node node52 = aVLTree26.getRoot();
    int i53 = aVLTree0.getBalance(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)0);
    int i5 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.delete((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    int i8 = aVLTree0.height();
    int i9 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete((int)'4');
    AVLTree.Node node28 = aVLTree0.find(100);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node32 = aVLTree0.find(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    AVLTree aVLTree14 = new AVLTree();
    aVLTree14.insert(0);
    AVLTree.Node node18 = aVLTree14.find(100);
    AVLTree.Node node19 = aVLTree14.getRoot();
    int i20 = aVLTree0.getBalance(node19);
    int i21 = aVLTree0.height();
    int i22 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(0);
    AVLTree.Node node28 = aVLTree0.find((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    AVLTree.Node node10 = aVLTree0.find(10);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)-1);
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree.Node node15 = aVLTree0.find(0);
    aVLTree0.delete((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node26 = aVLTree0.find(10);
    aVLTree0.insert((int)' ');
    AVLTree.Node node30 = aVLTree0.find(100);
    AVLTree.Node node31 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)100);
    int i16 = aVLTree0.height();
    aVLTree0.delete(100);
    AVLTree.Node node19 = aVLTree0.getRoot();
    int i20 = aVLTree0.height();
    aVLTree0.delete((int)(short)0);
    AVLTree.Node node23 = aVLTree0.getRoot();
    aVLTree0.insert(2);
    int i26 = aVLTree0.height();
    aVLTree0.insert((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node15 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)100);
    aVLTree0.insert(2);
    aVLTree0.insert((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree.Node node16 = aVLTree0.getRoot();
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    AVLTree.Node node27 = aVLTree20.getRoot();
    int i28 = aVLTree17.getBalance(node27);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    AVLTree.Node node36 = aVLTree29.getRoot();
    AVLTree.Node node37 = aVLTree29.getRoot();
    int i38 = aVLTree17.getBalance(node37);
    aVLTree17.insert(1);
    aVLTree17.delete((int)(short)-1);
    AVLTree aVLTree43 = new AVLTree();
    AVLTree.Node node44 = null;
    int i45 = aVLTree43.getBalance(node44);
    AVLTree.Node node47 = aVLTree43.find((int)'4');
    aVLTree43.insert(0);
    AVLTree.Node node50 = aVLTree43.getRoot();
    AVLTree.Node node51 = aVLTree43.getRoot();
    int i52 = aVLTree43.height();
    AVLTree.Node node53 = aVLTree43.getRoot();
    AVLTree.Node node54 = aVLTree43.getRoot();
    int i55 = aVLTree17.getBalance(node54);
    int i56 = aVLTree0.getBalance(node54);
    aVLTree0.insert((int)'a');
    AVLTree aVLTree59 = new AVLTree();
    aVLTree59.insert(0);
    AVLTree.Node node63 = aVLTree59.find((int)(short)-1);
    AVLTree aVLTree64 = new AVLTree();
    AVLTree.Node node65 = null;
    int i66 = aVLTree64.getBalance(node65);
    AVLTree aVLTree67 = new AVLTree();
    AVLTree.Node node68 = null;
    int i69 = aVLTree67.getBalance(node68);
    AVLTree.Node node71 = aVLTree67.find((int)'4');
    aVLTree67.insert(0);
    AVLTree.Node node74 = aVLTree67.getRoot();
    int i75 = aVLTree64.getBalance(node74);
    int i76 = aVLTree59.getBalance(node74);
    int i77 = aVLTree0.getBalance(node74);
    int i78 = aVLTree0.height();
    AVLTree.Node node80 = aVLTree0.find(1);
    AVLTree aVLTree81 = new AVLTree();
    AVLTree.Node node82 = null;
    int i83 = aVLTree81.getBalance(node82);
    AVLTree.Node node85 = aVLTree81.find((int)'4');
    int i86 = aVLTree81.height();
    aVLTree81.insert((int)(short)1);
    AVLTree.Node node90 = aVLTree81.find((int)'a');
    AVLTree.Node node91 = aVLTree81.getRoot();
    int i92 = aVLTree0.getBalance(node91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree.Node node10 = aVLTree0.getRoot();
    AVLTree.Node node12 = aVLTree0.find((int)'4');
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree.Node node14 = aVLTree0.getRoot();
    int i15 = aVLTree0.height();
    int i16 = aVLTree0.height();
    aVLTree0.insert(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    int i10 = aVLTree0.height();
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete(2);
    AVLTree aVLTree15 = new AVLTree();
    AVLTree.Node node16 = null;
    int i17 = aVLTree15.getBalance(node16);
    AVLTree.Node node19 = aVLTree15.find((int)'4');
    aVLTree15.insert(0);
    AVLTree.Node node22 = aVLTree15.getRoot();
    AVLTree.Node node23 = aVLTree15.getRoot();
    int i24 = aVLTree15.height();
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree.Node node32 = aVLTree28.find((int)'4');
    aVLTree28.insert(0);
    AVLTree.Node node35 = aVLTree28.getRoot();
    int i36 = aVLTree25.getBalance(node35);
    int i37 = aVLTree15.getBalance(node35);
    aVLTree15.delete((int)(short)10);
    aVLTree15.delete(100);
    AVLTree aVLTree42 = new AVLTree();
    AVLTree.Node node43 = null;
    int i44 = aVLTree42.getBalance(node43);
    AVLTree.Node node46 = aVLTree42.find((int)'4');
    aVLTree42.insert(0);
    aVLTree42.insert((int)(byte)10);
    AVLTree.Node node51 = aVLTree42.getRoot();
    int i52 = aVLTree15.getBalance(node51);
    int i53 = aVLTree15.height();
    aVLTree15.delete((int)(short)1);
    AVLTree aVLTree56 = new AVLTree();
    AVLTree.Node node57 = null;
    int i58 = aVLTree56.getBalance(node57);
    AVLTree.Node node60 = aVLTree56.find((int)'4');
    aVLTree56.insert(0);
    AVLTree.Node node63 = aVLTree56.getRoot();
    AVLTree.Node node64 = aVLTree56.getRoot();
    int i65 = aVLTree15.getBalance(node64);
    int i66 = aVLTree15.height();
    AVLTree aVLTree67 = new AVLTree();
    AVLTree.Node node68 = null;
    int i69 = aVLTree67.getBalance(node68);
    aVLTree67.insert(0);
    int i72 = aVLTree67.height();
    aVLTree67.delete((int)(byte)-1);
    AVLTree aVLTree75 = new AVLTree();
    AVLTree.Node node76 = null;
    int i77 = aVLTree75.getBalance(node76);
    AVLTree.Node node79 = aVLTree75.find((int)'4');
    aVLTree75.insert(0);
    AVLTree.Node node82 = aVLTree75.getRoot();
    int i83 = aVLTree67.getBalance(node82);
    AVLTree.Node node85 = aVLTree67.find((int)(short)0);
    int i86 = aVLTree15.getBalance(node85);
    AVLTree.Node node87 = aVLTree15.getRoot();
    AVLTree.Node node88 = aVLTree15.getRoot();
    int i89 = aVLTree0.getBalance(node88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node7 = aVLTree0.find((int)(byte)1);
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete(100);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree.Node node18 = aVLTree14.find((int)'4');
    aVLTree14.insert(0);
    AVLTree.Node node21 = aVLTree14.getRoot();
    int i22 = aVLTree14.height();
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    aVLTree23.insert(0);
    AVLTree.Node node28 = aVLTree23.getRoot();
    AVLTree.Node node29 = aVLTree23.getRoot();
    int i30 = aVLTree14.getBalance(node29);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    AVLTree.Node node38 = aVLTree31.getRoot();
    int i39 = aVLTree31.height();
    AVLTree aVLTree40 = new AVLTree();
    AVLTree.Node node41 = null;
    int i42 = aVLTree40.getBalance(node41);
    aVLTree40.insert(0);
    AVLTree.Node node45 = aVLTree40.getRoot();
    AVLTree.Node node46 = aVLTree40.getRoot();
    int i47 = aVLTree31.getBalance(node46);
    int i48 = aVLTree14.getBalance(node46);
    int i49 = aVLTree0.getBalance(node46);
    AVLTree.Node node51 = aVLTree0.find(100);
    int i52 = aVLTree0.height();
    AVLTree.Node node53 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)0);
    int i5 = aVLTree0.height();
    AVLTree.Node node6 = aVLTree0.getRoot();
    aVLTree0.delete(100);
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree.Node node12 = null;
    int i13 = aVLTree9.getBalance(node12);
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree.Node node18 = aVLTree14.find((int)'4');
    aVLTree14.insert(0);
    int i21 = aVLTree14.height();
    AVLTree.Node node23 = aVLTree14.find((int)(short)-1);
    AVLTree.Node node25 = aVLTree14.find((int)'#');
    AVLTree.Node node27 = aVLTree14.find((int)(byte)-1);
    aVLTree14.delete(100);
    AVLTree.Node node30 = aVLTree14.getRoot();
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    aVLTree31.insert(0);
    int i36 = aVLTree31.height();
    aVLTree31.delete((int)(byte)-1);
    aVLTree31.delete((int)(short)0);
    int i41 = aVLTree31.height();
    aVLTree31.insert((int)(byte)-1);
    AVLTree aVLTree44 = new AVLTree();
    AVLTree.Node node45 = null;
    int i46 = aVLTree44.getBalance(node45);
    AVLTree.Node node48 = aVLTree44.find((int)'4');
    aVLTree44.insert(0);
    AVLTree.Node node51 = aVLTree44.getRoot();
    AVLTree.Node node52 = aVLTree44.getRoot();
    AVLTree.Node node54 = aVLTree44.find(10);
    AVLTree.Node node56 = aVLTree44.find((int)(byte)-1);
    AVLTree.Node node57 = aVLTree44.getRoot();
    int i58 = aVLTree31.getBalance(node57);
    int i59 = aVLTree14.getBalance(node57);
    int i60 = aVLTree9.getBalance(node57);
    int i61 = aVLTree0.getBalance(node57);
    int i62 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == (-1));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    aVLTree0.insert((int)(byte)1);
    AVLTree.Node node11 = aVLTree0.getRoot();
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    int i19 = aVLTree12.height();
    AVLTree.Node node21 = aVLTree12.find((int)(short)-1);
    AVLTree.Node node23 = aVLTree12.find((int)'#');
    AVLTree.Node node25 = aVLTree12.find((int)(byte)-1);
    aVLTree12.delete(100);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    aVLTree28.insert(0);
    AVLTree.Node node33 = aVLTree28.getRoot();
    AVLTree.Node node34 = aVLTree28.getRoot();
    int i35 = aVLTree12.getBalance(node34);
    AVLTree.Node node37 = aVLTree12.find((int)(short)0);
    int i38 = aVLTree0.getBalance(node37);
    aVLTree0.insert((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)0);
    int i5 = aVLTree0.height();
    int i6 = aVLTree0.height();
    aVLTree0.delete(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node18 = aVLTree0.find(0);
    AVLTree.Node node19 = aVLTree0.getRoot();
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    int i27 = aVLTree20.height();
    AVLTree.Node node29 = aVLTree20.find((int)(short)-1);
    aVLTree20.insert((int)(short)1);
    AVLTree.Node node32 = aVLTree20.getRoot();
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    aVLTree33.insert(0);
    AVLTree.Node node38 = aVLTree33.getRoot();
    int i39 = aVLTree20.getBalance(node38);
    aVLTree20.insert(10);
    AVLTree.Node node42 = aVLTree20.getRoot();
    aVLTree20.delete((int)(byte)100);
    AVLTree aVLTree45 = new AVLTree();
    AVLTree.Node node46 = null;
    int i47 = aVLTree45.getBalance(node46);
    AVLTree.Node node49 = aVLTree45.find((int)'4');
    aVLTree45.insert(0);
    AVLTree.Node node52 = aVLTree45.getRoot();
    AVLTree.Node node53 = aVLTree45.getRoot();
    aVLTree45.insert((int)(byte)1);
    AVLTree.Node node56 = aVLTree45.getRoot();
    int i57 = aVLTree20.getBalance(node56);
    int i58 = aVLTree20.height();
    int i59 = aVLTree20.height();
    AVLTree.Node node61 = aVLTree20.find((int)'a');
    aVLTree20.delete((int)(short)-1);
    AVLTree aVLTree64 = new AVLTree();
    aVLTree64.insert(0);
    int i67 = aVLTree64.height();
    int i68 = aVLTree64.height();
    AVLTree aVLTree69 = new AVLTree();
    AVLTree.Node node70 = null;
    int i71 = aVLTree69.getBalance(node70);
    aVLTree69.insert(0);
    AVLTree.Node node74 = aVLTree69.getRoot();
    AVLTree.Node node75 = aVLTree69.getRoot();
    AVLTree.Node node77 = aVLTree69.find((int)(short)10);
    AVLTree.Node node78 = aVLTree69.getRoot();
    AVLTree.Node node79 = aVLTree69.getRoot();
    int i80 = aVLTree64.getBalance(node79);
    int i81 = aVLTree20.getBalance(node79);
    int i82 = aVLTree0.getBalance(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    int i25 = aVLTree0.height();
    int i26 = aVLTree0.height();
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.delete(0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)' ');
    aVLTree0.delete((int)' ');
    AVLTree.Node node20 = aVLTree0.find((int)'4');
    aVLTree0.delete((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    AVLTree.Node node18 = aVLTree13.getRoot();
    int i19 = aVLTree0.getBalance(node18);
    aVLTree0.insert(10);
    AVLTree.Node node22 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    AVLTree.Node node32 = aVLTree25.getRoot();
    AVLTree.Node node33 = aVLTree25.getRoot();
    aVLTree25.insert((int)(byte)1);
    AVLTree.Node node36 = aVLTree25.getRoot();
    int i37 = aVLTree0.getBalance(node36);
    int i38 = aVLTree0.height();
    int i39 = aVLTree0.height();
    aVLTree0.insert((-1));
    int i42 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert((int)' ');
    int i7 = aVLTree0.height();
    AVLTree.Node node8 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    aVLTree23.insert(0);
    int i28 = aVLTree23.height();
    aVLTree23.delete((int)(byte)-1);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    AVLTree.Node node38 = aVLTree31.getRoot();
    int i39 = aVLTree23.getBalance(node38);
    int i40 = aVLTree0.getBalance(node38);
    int i41 = aVLTree0.height();
    aVLTree0.delete(0);
    AVLTree.Node node45 = aVLTree0.find((int)(byte)100);
    AVLTree.Node node46 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node46);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)' ');
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    int i20 = aVLTree13.height();
    AVLTree.Node node22 = aVLTree13.find((int)(short)-1);
    aVLTree13.insert((int)(short)1);
    AVLTree.Node node25 = aVLTree13.getRoot();
    aVLTree13.delete((int)(byte)0);
    aVLTree13.delete((int)(short)10);
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    AVLTree.Node node37 = aVLTree33.find((int)'4');
    aVLTree33.insert(0);
    AVLTree.Node node40 = aVLTree33.getRoot();
    int i41 = aVLTree30.getBalance(node40);
    int i42 = aVLTree13.getBalance(node40);
    int i43 = aVLTree0.getBalance(node40);
    AVLTree.Node node44 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    aVLTree25.insert(0);
    AVLTree.Node node30 = aVLTree25.getRoot();
    AVLTree.Node node31 = aVLTree25.getRoot();
    int i32 = aVLTree0.getBalance(node31);
    aVLTree0.insert((int)'#');
    aVLTree0.delete((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    aVLTree0.delete((int)(short)-1);
    aVLTree0.delete(0);
    AVLTree.Node node14 = aVLTree0.getRoot();
    AVLTree.Node node15 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    AVLTree.Node node6 = aVLTree0.find(10);
    AVLTree aVLTree7 = new AVLTree();
    AVLTree.Node node8 = null;
    int i9 = aVLTree7.getBalance(node8);
    AVLTree.Node node11 = aVLTree7.find((int)'4');
    aVLTree7.insert(0);
    AVLTree.Node node14 = aVLTree7.getRoot();
    AVLTree.Node node15 = aVLTree7.getRoot();
    aVLTree7.delete((int)'#');
    int i18 = aVLTree7.height();
    AVLTree.Node node20 = aVLTree7.find((int)'#');
    AVLTree.Node node21 = aVLTree7.getRoot();
    int i22 = aVLTree0.getBalance(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = null;
    int i6 = aVLTree0.getBalance(node5);
    AVLTree.Node node7 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    AVLTree.Node node19 = aVLTree11.getRoot();
    aVLTree11.insert((int)(byte)1);
    AVLTree aVLTree22 = new AVLTree();
    AVLTree.Node node23 = null;
    int i24 = aVLTree22.getBalance(node23);
    AVLTree.Node node26 = aVLTree22.find((int)'4');
    aVLTree22.insert(0);
    AVLTree.Node node29 = aVLTree22.getRoot();
    int i30 = aVLTree11.getBalance(node29);
    int i31 = aVLTree0.getBalance(node29);
    aVLTree0.delete((int)(short)10);
    AVLTree.Node node35 = aVLTree0.find((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    int i20 = aVLTree13.height();
    AVLTree.Node node22 = aVLTree13.find((int)(short)-1);
    AVLTree.Node node24 = aVLTree13.find((int)'#');
    int i25 = aVLTree13.height();
    AVLTree.Node node26 = aVLTree13.getRoot();
    int i27 = aVLTree0.getBalance(node26);
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree.Node node32 = aVLTree28.find((int)'4');
    aVLTree28.insert(0);
    int i35 = aVLTree28.height();
    AVLTree.Node node37 = aVLTree28.find((int)(short)-1);
    aVLTree28.insert((int)(short)1);
    AVLTree.Node node40 = aVLTree28.getRoot();
    aVLTree28.delete((int)(byte)0);
    AVLTree.Node node43 = aVLTree28.getRoot();
    int i44 = aVLTree0.getBalance(node43);
    AVLTree.Node node46 = aVLTree0.find(0);
    int i47 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node15 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.delete(1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node13 = aVLTree0.find((int)'a');
    AVLTree.Node node14 = aVLTree0.getRoot();
    AVLTree aVLTree15 = new AVLTree();
    AVLTree.Node node16 = null;
    int i17 = aVLTree15.getBalance(node16);
    AVLTree.Node node19 = aVLTree15.find((int)'4');
    aVLTree15.insert(0);
    AVLTree.Node node22 = aVLTree15.getRoot();
    AVLTree.Node node23 = aVLTree15.getRoot();
    aVLTree15.insert((int)(byte)1);
    AVLTree.Node node26 = aVLTree15.getRoot();
    int i27 = aVLTree0.getBalance(node26);
    int i28 = aVLTree0.height();
    int i29 = aVLTree0.height();
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)'4');
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree.Node node18 = aVLTree14.find((int)'4');
    aVLTree14.insert(0);
    int i21 = aVLTree14.height();
    AVLTree.Node node23 = aVLTree14.find((int)(short)-1);
    aVLTree14.insert((int)(short)1);
    AVLTree.Node node26 = aVLTree14.getRoot();
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    aVLTree27.insert(0);
    AVLTree.Node node32 = aVLTree27.getRoot();
    int i33 = aVLTree14.getBalance(node32);
    aVLTree14.insert(10);
    AVLTree.Node node36 = aVLTree14.getRoot();
    int i37 = aVLTree0.getBalance(node36);
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree.Node node45 = aVLTree41.find((int)'4');
    aVLTree41.insert(0);
    AVLTree.Node node48 = aVLTree41.getRoot();
    int i49 = aVLTree38.getBalance(node48);
    AVLTree aVLTree50 = new AVLTree();
    AVLTree.Node node51 = null;
    int i52 = aVLTree50.getBalance(node51);
    AVLTree.Node node54 = aVLTree50.find((int)'4');
    aVLTree50.insert(0);
    AVLTree.Node node57 = aVLTree50.getRoot();
    AVLTree.Node node58 = aVLTree50.getRoot();
    int i59 = aVLTree38.getBalance(node58);
    aVLTree38.insert(1);
    aVLTree38.delete((int)(short)-1);
    AVLTree aVLTree64 = new AVLTree();
    AVLTree.Node node65 = null;
    int i66 = aVLTree64.getBalance(node65);
    AVLTree.Node node68 = aVLTree64.find((int)'4');
    aVLTree64.insert(0);
    AVLTree.Node node71 = aVLTree64.getRoot();
    AVLTree.Node node72 = aVLTree64.getRoot();
    int i73 = aVLTree64.height();
    AVLTree.Node node74 = aVLTree64.getRoot();
    AVLTree.Node node75 = aVLTree64.getRoot();
    int i76 = aVLTree38.getBalance(node75);
    int i77 = aVLTree0.getBalance(node75);
    aVLTree0.insert((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node17 = aVLTree0.getRoot();
    aVLTree0.delete(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    aVLTree8.insert((int)(byte)10);
    AVLTree.Node node18 = aVLTree8.find((int)(short)1);
    AVLTree.Node node19 = aVLTree8.getRoot();
    int i20 = aVLTree0.getBalance(node19);
    aVLTree0.delete((int)(byte)-1);
    int i23 = aVLTree0.height();
    aVLTree0.insert((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    int i20 = aVLTree9.getBalance(node19);
    int i21 = aVLTree0.getBalance(node19);
    aVLTree0.delete((int)(byte)100);
    int i24 = aVLTree0.height();
    AVLTree.Node node26 = aVLTree0.find((int)(byte)100);
    int i27 = aVLTree0.height();
    int i28 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    aVLTree0.insert(100);
    aVLTree0.insert(2);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node4 = aVLTree0.find((int)(byte)0);
    aVLTree0.insert((int)'a');
    AVLTree.Node node8 = aVLTree0.find(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    aVLTree0.delete(2);
    aVLTree0.insert(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    AVLTree.Node node15 = aVLTree8.getRoot();
    int i16 = aVLTree5.getBalance(node15);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    AVLTree.Node node25 = aVLTree17.getRoot();
    int i26 = aVLTree5.getBalance(node25);
    int i27 = aVLTree0.getBalance(node25);
    aVLTree0.insert((int)(byte)100);
    AVLTree.Node node31 = aVLTree0.find((int)'4');
    AVLTree aVLTree32 = new AVLTree();
    AVLTree.Node node33 = null;
    int i34 = aVLTree32.getBalance(node33);
    AVLTree.Node node36 = aVLTree32.find((int)'4');
    aVLTree32.insert(0);
    aVLTree32.insert((int)(byte)10);
    AVLTree.Node node41 = aVLTree32.getRoot();
    aVLTree32.insert((int)(short)100);
    AVLTree.Node node45 = aVLTree32.find((int)'a');
    AVLTree.Node node46 = aVLTree32.getRoot();
    AVLTree aVLTree47 = new AVLTree();
    AVLTree.Node node48 = null;
    int i49 = aVLTree47.getBalance(node48);
    AVLTree.Node node51 = aVLTree47.find((int)'4');
    aVLTree47.insert(0);
    AVLTree.Node node54 = aVLTree47.getRoot();
    AVLTree.Node node55 = aVLTree47.getRoot();
    aVLTree47.insert((int)(byte)1);
    AVLTree.Node node58 = aVLTree47.getRoot();
    int i59 = aVLTree32.getBalance(node58);
    int i60 = aVLTree0.getBalance(node58);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    AVLTree.Node node25 = aVLTree0.getRoot();
    AVLTree aVLTree26 = new AVLTree();
    AVLTree.Node node27 = null;
    int i28 = aVLTree26.getBalance(node27);
    AVLTree.Node node30 = aVLTree26.find((int)'4');
    aVLTree26.insert(0);
    AVLTree.Node node33 = aVLTree26.getRoot();
    AVLTree.Node node34 = aVLTree26.getRoot();
    int i35 = aVLTree26.height();
    AVLTree aVLTree36 = new AVLTree();
    AVLTree aVLTree37 = new AVLTree();
    AVLTree.Node node38 = null;
    int i39 = aVLTree37.getBalance(node38);
    AVLTree.Node node41 = aVLTree37.find((int)'4');
    aVLTree37.insert(0);
    AVLTree.Node node44 = aVLTree37.getRoot();
    int i45 = aVLTree36.getBalance(node44);
    int i46 = aVLTree26.getBalance(node44);
    aVLTree26.insert((int)(short)-1);
    AVLTree.Node node49 = aVLTree26.getRoot();
    AVLTree aVLTree50 = new AVLTree();
    AVLTree.Node node51 = null;
    int i52 = aVLTree50.getBalance(node51);
    AVLTree aVLTree53 = new AVLTree();
    AVLTree.Node node54 = null;
    int i55 = aVLTree53.getBalance(node54);
    AVLTree.Node node57 = aVLTree53.find((int)'4');
    aVLTree53.insert(0);
    AVLTree.Node node60 = aVLTree53.getRoot();
    int i61 = aVLTree50.getBalance(node60);
    AVLTree aVLTree62 = new AVLTree();
    AVLTree.Node node63 = null;
    int i64 = aVLTree62.getBalance(node63);
    AVLTree.Node node66 = aVLTree62.find((int)'4');
    aVLTree62.insert(0);
    AVLTree.Node node69 = aVLTree62.getRoot();
    AVLTree.Node node70 = aVLTree62.getRoot();
    int i71 = aVLTree50.getBalance(node70);
    int i72 = aVLTree26.getBalance(node70);
    aVLTree26.insert((int)(short)100);
    AVLTree.Node node75 = aVLTree26.getRoot();
    int i76 = aVLTree0.getBalance(node75);
    AVLTree.Node node78 = aVLTree0.find(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node78);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.delete((int)'a');
    aVLTree0.insert((-1));
    aVLTree0.delete((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    aVLTree23.insert(0);
    int i28 = aVLTree23.height();
    aVLTree23.delete((int)(byte)-1);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    AVLTree.Node node38 = aVLTree31.getRoot();
    int i39 = aVLTree23.getBalance(node38);
    int i40 = aVLTree0.getBalance(node38);
    int i41 = aVLTree0.height();
    aVLTree0.delete(0);
    AVLTree.Node node45 = aVLTree0.find((int)(byte)100);
    aVLTree0.insert((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    aVLTree10.insert(0);
    AVLTree.Node node13 = aVLTree10.getRoot();
    aVLTree10.delete((int)(byte)100);
    aVLTree10.delete((int)' ');
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    aVLTree18.insert(0);
    AVLTree.Node node23 = aVLTree18.getRoot();
    AVLTree.Node node24 = aVLTree18.getRoot();
    AVLTree.Node node26 = aVLTree18.find((int)(short)10);
    aVLTree18.insert((int)(byte)1);
    AVLTree.Node node29 = aVLTree18.getRoot();
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree.Node node34 = aVLTree30.find((int)'4');
    aVLTree30.insert(0);
    int i37 = aVLTree30.height();
    AVLTree.Node node39 = aVLTree30.find((int)(short)-1);
    AVLTree.Node node41 = aVLTree30.find((int)'#');
    AVLTree.Node node43 = aVLTree30.find((int)(byte)-1);
    aVLTree30.delete(100);
    AVLTree aVLTree46 = new AVLTree();
    AVLTree.Node node47 = null;
    int i48 = aVLTree46.getBalance(node47);
    aVLTree46.insert(0);
    AVLTree.Node node51 = aVLTree46.getRoot();
    AVLTree.Node node52 = aVLTree46.getRoot();
    int i53 = aVLTree30.getBalance(node52);
    AVLTree.Node node55 = aVLTree30.find((int)(short)0);
    int i56 = aVLTree18.getBalance(node55);
    int i57 = aVLTree10.getBalance(node55);
    int i58 = aVLTree0.getBalance(node55);
    aVLTree0.insert((int)(byte)100);
    int i61 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    int i20 = aVLTree9.getBalance(node19);
    int i21 = aVLTree0.getBalance(node19);
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node25 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    aVLTree0.insert((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    int i12 = aVLTree0.height();
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree.Node node18 = aVLTree14.find((int)'4');
    aVLTree14.insert(0);
    AVLTree.Node node21 = aVLTree14.getRoot();
    AVLTree.Node node22 = aVLTree14.getRoot();
    int i23 = aVLTree14.height();
    AVLTree.Node node24 = aVLTree14.getRoot();
    AVLTree.Node node25 = aVLTree14.getRoot();
    int i26 = aVLTree0.getBalance(node25);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    aVLTree27.insert(0);
    AVLTree.Node node32 = aVLTree27.getRoot();
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    AVLTree.Node node37 = aVLTree33.find((int)'4');
    aVLTree33.insert(0);
    aVLTree33.insert((int)(byte)10);
    AVLTree.Node node43 = aVLTree33.find((int)(short)1);
    AVLTree.Node node45 = aVLTree33.find((int)(byte)100);
    AVLTree.Node node46 = aVLTree33.getRoot();
    AVLTree aVLTree47 = new AVLTree();
    AVLTree.Node node48 = null;
    int i49 = aVLTree47.getBalance(node48);
    AVLTree aVLTree50 = new AVLTree();
    AVLTree.Node node51 = null;
    int i52 = aVLTree50.getBalance(node51);
    AVLTree.Node node54 = aVLTree50.find((int)'4');
    aVLTree50.insert(0);
    AVLTree.Node node57 = aVLTree50.getRoot();
    int i58 = aVLTree47.getBalance(node57);
    int i59 = aVLTree33.getBalance(node57);
    int i60 = aVLTree33.height();
    AVLTree.Node node61 = aVLTree33.getRoot();
    int i62 = aVLTree27.getBalance(node61);
    int i63 = aVLTree0.getBalance(node61);
    int i64 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node15 = aVLTree0.getRoot();
    aVLTree0.insert((int)'#');
    AVLTree.Node node19 = aVLTree0.find((int)' ');
    aVLTree0.insert((int)(short)10);
    int i22 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree.Node node10 = aVLTree0.getRoot();
    AVLTree.Node node12 = aVLTree0.find((int)'4');
    AVLTree.Node node13 = aVLTree0.getRoot();
    aVLTree0.insert((int)(byte)-1);
    AVLTree.Node node17 = aVLTree0.find((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node10 = aVLTree0.find((int)(short)1);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)100);
    aVLTree0.insert((int)'a');
    aVLTree0.insert((int)(byte)100);
    aVLTree0.delete((int)(byte)0);
    AVLTree aVLTree19 = new AVLTree();
    AVLTree.Node node20 = null;
    int i21 = aVLTree19.getBalance(node20);
    AVLTree.Node node23 = aVLTree19.find((int)'4');
    AVLTree.Node node25 = aVLTree19.find(10);
    aVLTree19.delete(10);
    int i28 = aVLTree19.height();
    int i29 = aVLTree19.height();
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree.Node node34 = aVLTree30.find((int)'4');
    aVLTree30.insert(0);
    int i37 = aVLTree30.height();
    AVLTree.Node node39 = aVLTree30.find((int)(short)-1);
    AVLTree.Node node41 = aVLTree30.find((int)'#');
    AVLTree.Node node43 = aVLTree30.find((int)(byte)-1);
    aVLTree30.delete(100);
    AVLTree.Node node46 = aVLTree30.getRoot();
    int i47 = aVLTree19.getBalance(node46);
    int i48 = aVLTree0.getBalance(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    int i8 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    int i11 = aVLTree0.height();
    aVLTree0.insert((int)'a');
    int i14 = aVLTree0.height();
    int i15 = aVLTree0.height();
    AVLTree.Node node16 = null;
    int i17 = aVLTree0.getBalance(node16);
    aVLTree0.insert(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree.Node node16 = aVLTree0.getRoot();
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    AVLTree.Node node27 = aVLTree20.getRoot();
    int i28 = aVLTree17.getBalance(node27);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    AVLTree.Node node36 = aVLTree29.getRoot();
    AVLTree.Node node37 = aVLTree29.getRoot();
    int i38 = aVLTree17.getBalance(node37);
    aVLTree17.insert(1);
    aVLTree17.delete((int)(short)-1);
    AVLTree aVLTree43 = new AVLTree();
    AVLTree.Node node44 = null;
    int i45 = aVLTree43.getBalance(node44);
    AVLTree.Node node47 = aVLTree43.find((int)'4');
    aVLTree43.insert(0);
    AVLTree.Node node50 = aVLTree43.getRoot();
    AVLTree.Node node51 = aVLTree43.getRoot();
    int i52 = aVLTree43.height();
    AVLTree.Node node53 = aVLTree43.getRoot();
    AVLTree.Node node54 = aVLTree43.getRoot();
    int i55 = aVLTree17.getBalance(node54);
    int i56 = aVLTree0.getBalance(node54);
    aVLTree0.insert((int)'a');
    AVLTree.Node node60 = aVLTree0.find((-1));
    AVLTree aVLTree61 = new AVLTree();
    aVLTree61.insert(0);
    AVLTree.Node node65 = aVLTree61.find((int)(short)-1);
    AVLTree aVLTree66 = new AVLTree();
    AVLTree.Node node67 = null;
    int i68 = aVLTree66.getBalance(node67);
    AVLTree aVLTree69 = new AVLTree();
    AVLTree.Node node70 = null;
    int i71 = aVLTree69.getBalance(node70);
    AVLTree.Node node73 = aVLTree69.find((int)'4');
    aVLTree69.insert(0);
    AVLTree.Node node76 = aVLTree69.getRoot();
    int i77 = aVLTree66.getBalance(node76);
    int i78 = aVLTree61.getBalance(node76);
    AVLTree.Node node80 = aVLTree61.find((int)(byte)0);
    int i81 = aVLTree0.getBalance(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    int i8 = aVLTree0.height();
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node11 = aVLTree0.getRoot();
    AVLTree.Node node13 = aVLTree0.find((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    AVLTree.Node node15 = aVLTree8.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    AVLTree.Node node17 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)1);
    int i20 = aVLTree0.height();
    AVLTree.Node node22 = aVLTree0.find((int)(byte)1);
    aVLTree0.delete((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    aVLTree27.insert((int)(byte)10);
    AVLTree.Node node36 = aVLTree27.getRoot();
    int i37 = aVLTree0.getBalance(node36);
    int i38 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree.Node node45 = aVLTree41.find((int)'4');
    aVLTree41.insert(0);
    AVLTree.Node node48 = aVLTree41.getRoot();
    AVLTree.Node node49 = aVLTree41.getRoot();
    int i50 = aVLTree0.getBalance(node49);
    int i51 = aVLTree0.height();
    AVLTree aVLTree52 = new AVLTree();
    AVLTree.Node node53 = null;
    int i54 = aVLTree52.getBalance(node53);
    aVLTree52.insert(0);
    int i57 = aVLTree52.height();
    aVLTree52.delete((int)(byte)-1);
    AVLTree aVLTree60 = new AVLTree();
    AVLTree.Node node61 = null;
    int i62 = aVLTree60.getBalance(node61);
    AVLTree.Node node64 = aVLTree60.find((int)'4');
    aVLTree60.insert(0);
    AVLTree.Node node67 = aVLTree60.getRoot();
    int i68 = aVLTree52.getBalance(node67);
    AVLTree.Node node70 = aVLTree52.find((int)(short)0);
    int i71 = aVLTree0.getBalance(node70);
    AVLTree.Node node73 = aVLTree0.find((int)(short)10);
    AVLTree aVLTree74 = new AVLTree();
    aVLTree74.insert(0);
    AVLTree.Node node78 = aVLTree74.find(100);
    AVLTree.Node node79 = aVLTree74.getRoot();
    int i80 = aVLTree0.getBalance(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)100);
    int i16 = aVLTree0.height();
    AVLTree.Node node18 = aVLTree0.find((int)(byte)10);
    AVLTree.Node node20 = aVLTree0.find((int)(short)-1);
    aVLTree0.delete((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)' ');
    aVLTree0.insert((int)'4');
    AVLTree.Node node15 = aVLTree0.find((int)(short)-1);
    int i16 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    int i13 = aVLTree0.height();
    int i14 = aVLTree0.height();
    aVLTree0.insert((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree.Node node7 = aVLTree0.find((int)(byte)100);
    int i8 = aVLTree0.height();
    aVLTree0.delete(2);
    AVLTree.Node node12 = aVLTree0.find((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    aVLTree12.insert(0);
    AVLTree.Node node17 = aVLTree12.getRoot();
    AVLTree.Node node18 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.find((int)(short)10);
    aVLTree12.insert((int)(byte)1);
    AVLTree.Node node23 = aVLTree12.getRoot();
    int i24 = aVLTree0.getBalance(node23);
    aVLTree0.delete((int)'#');
    AVLTree.Node node28 = aVLTree0.find((int)(byte)10);
    aVLTree0.delete((int)'4');
    AVLTree.Node node32 = aVLTree0.find((-1));
    aVLTree0.delete((int)(short)0);
    int i35 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    aVLTree0.delete((int)' ');
    aVLTree0.delete((-1));
    aVLTree0.delete(0);
    AVLTree.Node node19 = aVLTree0.getRoot();
    int i20 = aVLTree0.height();
    int i21 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree aVLTree7 = new AVLTree();
    AVLTree.Node node8 = null;
    int i9 = aVLTree7.getBalance(node8);
    AVLTree.Node node11 = aVLTree7.find((int)'4');
    aVLTree7.insert(0);
    AVLTree.Node node14 = aVLTree7.getRoot();
    AVLTree.Node node15 = aVLTree7.getRoot();
    aVLTree7.insert((int)(byte)1);
    AVLTree aVLTree18 = new AVLTree();
    AVLTree.Node node19 = null;
    int i20 = aVLTree18.getBalance(node19);
    AVLTree.Node node22 = aVLTree18.find((int)'4');
    aVLTree18.insert(0);
    AVLTree.Node node25 = aVLTree18.getRoot();
    int i26 = aVLTree7.getBalance(node25);
    int i27 = aVLTree0.getBalance(node25);
    AVLTree.Node node29 = aVLTree0.find((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)10);
    aVLTree0.insert((int)(short)10);
    int i20 = aVLTree0.height();
    aVLTree0.delete((int)'a');
    AVLTree.Node node23 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete((int)(short)0);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    int i38 = aVLTree31.height();
    AVLTree.Node node40 = aVLTree31.find((int)(short)-1);
    aVLTree31.insert((int)(short)1);
    AVLTree.Node node43 = aVLTree31.getRoot();
    AVLTree aVLTree44 = new AVLTree();
    AVLTree.Node node45 = null;
    int i46 = aVLTree44.getBalance(node45);
    aVLTree44.insert(0);
    AVLTree.Node node49 = aVLTree44.getRoot();
    int i50 = aVLTree31.getBalance(node49);
    aVLTree31.insert(10);
    AVLTree.Node node53 = aVLTree31.getRoot();
    int i54 = aVLTree0.getBalance(node53);
    aVLTree0.delete((int)'a');
    aVLTree0.insert((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    int i25 = aVLTree0.height();
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert(0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    AVLTree.Node node10 = aVLTree0.find(10);
    AVLTree.Node node12 = aVLTree0.find((int)(byte)-1);
    AVLTree.Node node14 = aVLTree0.find(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node15 = aVLTree0.find((int)(short)0);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    AVLTree.Node node20 = aVLTree16.find((int)'4');
    aVLTree16.insert(0);
    int i23 = aVLTree16.height();
    AVLTree.Node node25 = aVLTree16.find((int)(short)-1);
    AVLTree.Node node27 = aVLTree16.find((int)'#');
    AVLTree.Node node28 = aVLTree16.getRoot();
    int i29 = aVLTree0.getBalance(node28);
    int i30 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    AVLTree.Node node25 = aVLTree0.getRoot();
    AVLTree aVLTree26 = new AVLTree();
    AVLTree.Node node27 = null;
    int i28 = aVLTree26.getBalance(node27);
    AVLTree.Node node30 = aVLTree26.find((int)'4');
    aVLTree26.insert(0);
    AVLTree.Node node33 = aVLTree26.getRoot();
    AVLTree.Node node34 = aVLTree26.getRoot();
    int i35 = aVLTree26.height();
    AVLTree aVLTree36 = new AVLTree();
    AVLTree aVLTree37 = new AVLTree();
    AVLTree.Node node38 = null;
    int i39 = aVLTree37.getBalance(node38);
    AVLTree.Node node41 = aVLTree37.find((int)'4');
    aVLTree37.insert(0);
    AVLTree.Node node44 = aVLTree37.getRoot();
    int i45 = aVLTree36.getBalance(node44);
    int i46 = aVLTree26.getBalance(node44);
    aVLTree26.insert((int)(short)-1);
    AVLTree.Node node49 = aVLTree26.getRoot();
    AVLTree aVLTree50 = new AVLTree();
    AVLTree.Node node51 = null;
    int i52 = aVLTree50.getBalance(node51);
    AVLTree aVLTree53 = new AVLTree();
    AVLTree.Node node54 = null;
    int i55 = aVLTree53.getBalance(node54);
    AVLTree.Node node57 = aVLTree53.find((int)'4');
    aVLTree53.insert(0);
    AVLTree.Node node60 = aVLTree53.getRoot();
    int i61 = aVLTree50.getBalance(node60);
    AVLTree aVLTree62 = new AVLTree();
    AVLTree.Node node63 = null;
    int i64 = aVLTree62.getBalance(node63);
    AVLTree.Node node66 = aVLTree62.find((int)'4');
    aVLTree62.insert(0);
    AVLTree.Node node69 = aVLTree62.getRoot();
    AVLTree.Node node70 = aVLTree62.getRoot();
    int i71 = aVLTree50.getBalance(node70);
    int i72 = aVLTree26.getBalance(node70);
    aVLTree26.insert((int)(short)100);
    AVLTree.Node node75 = aVLTree26.getRoot();
    int i76 = aVLTree0.getBalance(node75);
    AVLTree.Node node78 = aVLTree0.find((int)'#');
    int i79 = aVLTree0.height();
    AVLTree.Node node81 = aVLTree0.find((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node81);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    AVLTree.Node node15 = aVLTree8.getRoot();
    int i16 = aVLTree5.getBalance(node15);
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree.Node node21 = aVLTree17.find((int)'4');
    aVLTree17.insert(0);
    AVLTree.Node node24 = aVLTree17.getRoot();
    AVLTree.Node node25 = aVLTree17.getRoot();
    int i26 = aVLTree5.getBalance(node25);
    int i27 = aVLTree0.getBalance(node25);
    aVLTree0.insert((int)(byte)100);
    AVLTree.Node node31 = aVLTree0.find((int)'4');
    AVLTree aVLTree32 = new AVLTree();
    AVLTree.Node node33 = null;
    int i34 = aVLTree32.getBalance(node33);
    AVLTree.Node node36 = aVLTree32.find((int)'4');
    aVLTree32.insert(0);
    aVLTree32.insert((int)(byte)10);
    AVLTree.Node node41 = aVLTree32.getRoot();
    aVLTree32.insert((int)(short)100);
    AVLTree.Node node45 = aVLTree32.find((int)'a');
    AVLTree.Node node46 = aVLTree32.getRoot();
    AVLTree aVLTree47 = new AVLTree();
    AVLTree.Node node48 = null;
    int i49 = aVLTree47.getBalance(node48);
    AVLTree.Node node51 = aVLTree47.find((int)'4');
    aVLTree47.insert(0);
    AVLTree.Node node54 = aVLTree47.getRoot();
    AVLTree.Node node55 = aVLTree47.getRoot();
    aVLTree47.insert((int)(byte)1);
    AVLTree.Node node58 = aVLTree47.getRoot();
    int i59 = aVLTree32.getBalance(node58);
    int i60 = aVLTree0.getBalance(node58);
    AVLTree aVLTree61 = new AVLTree();
    aVLTree61.insert(0);
    int i64 = aVLTree61.height();
    int i65 = aVLTree61.height();
    AVLTree aVLTree66 = new AVLTree();
    AVLTree.Node node67 = null;
    int i68 = aVLTree66.getBalance(node67);
    aVLTree66.insert(0);
    AVLTree.Node node71 = aVLTree66.getRoot();
    AVLTree.Node node72 = aVLTree66.getRoot();
    AVLTree.Node node74 = aVLTree66.find((int)(short)10);
    AVLTree.Node node75 = aVLTree66.getRoot();
    AVLTree.Node node76 = aVLTree66.getRoot();
    int i77 = aVLTree61.getBalance(node76);
    int i78 = aVLTree0.getBalance(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete(100);
    int i25 = aVLTree0.height();
    AVLTree.Node node27 = aVLTree0.find(0);
    aVLTree0.delete((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)(short)1);
    AVLTree.Node node9 = aVLTree0.find(0);
    AVLTree.Node node11 = aVLTree0.find((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree.Node node11 = null;
    int i12 = aVLTree10.getBalance(node11);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree10.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete(100);
    aVLTree0.delete((int)(byte)1);
    aVLTree0.delete((int)(short)0);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    int i38 = aVLTree31.height();
    AVLTree.Node node40 = aVLTree31.find((int)(short)-1);
    aVLTree31.insert((int)(short)1);
    AVLTree.Node node43 = aVLTree31.getRoot();
    AVLTree aVLTree44 = new AVLTree();
    AVLTree.Node node45 = null;
    int i46 = aVLTree44.getBalance(node45);
    aVLTree44.insert(0);
    AVLTree.Node node49 = aVLTree44.getRoot();
    int i50 = aVLTree31.getBalance(node49);
    aVLTree31.insert(10);
    AVLTree.Node node53 = aVLTree31.getRoot();
    int i54 = aVLTree0.getBalance(node53);
    aVLTree0.delete((int)'a');
    AVLTree.Node node57 = aVLTree0.getRoot();
    aVLTree0.insert(10);
    AVLTree.Node node61 = aVLTree0.find(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node61);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    AVLTree.Node node12 = aVLTree8.find((int)'4');
    aVLTree8.insert(0);
    int i15 = aVLTree8.height();
    AVLTree.Node node17 = aVLTree8.find((int)(short)-1);
    AVLTree.Node node19 = aVLTree8.find((int)'#');
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    aVLTree20.insert(0);
    AVLTree.Node node25 = aVLTree20.getRoot();
    AVLTree.Node node26 = aVLTree20.getRoot();
    AVLTree.Node node28 = aVLTree20.find((int)(short)10);
    AVLTree.Node node29 = aVLTree20.getRoot();
    int i30 = aVLTree8.getBalance(node29);
    int i31 = aVLTree0.getBalance(node29);
    aVLTree0.delete(1);
    AVLTree.Node node35 = aVLTree0.find((int)'4');
    int i36 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree.Node node11 = aVLTree0.find((int)(short)10);
    aVLTree0.delete((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree.Node node10 = aVLTree0.getRoot();
    int i11 = aVLTree0.height();
    aVLTree0.delete((int)(short)10);
    AVLTree aVLTree14 = new AVLTree();
    aVLTree14.delete((int)(short)1);
    AVLTree.Node node17 = aVLTree14.getRoot();
    AVLTree aVLTree18 = new AVLTree();
    aVLTree18.insert(0);
    AVLTree.Node node22 = aVLTree18.find(100);
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    aVLTree23.insert(0);
    int i28 = aVLTree23.height();
    aVLTree23.delete((int)(byte)-1);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    AVLTree.Node node35 = aVLTree31.find((int)'4');
    aVLTree31.insert(0);
    AVLTree.Node node38 = aVLTree31.getRoot();
    int i39 = aVLTree23.getBalance(node38);
    int i40 = aVLTree18.getBalance(node38);
    AVLTree aVLTree41 = new AVLTree();
    aVLTree41.insert(0);
    AVLTree.Node node44 = aVLTree41.getRoot();
    int i45 = aVLTree18.getBalance(node44);
    int i46 = aVLTree14.getBalance(node44);
    int i47 = aVLTree0.getBalance(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.delete(100);
    AVLTree.Node node16 = aVLTree0.getRoot();
    AVLTree aVLTree17 = new AVLTree();
    AVLTree.Node node18 = null;
    int i19 = aVLTree17.getBalance(node18);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    AVLTree.Node node27 = aVLTree20.getRoot();
    int i28 = aVLTree17.getBalance(node27);
    AVLTree aVLTree29 = new AVLTree();
    AVLTree.Node node30 = null;
    int i31 = aVLTree29.getBalance(node30);
    AVLTree.Node node33 = aVLTree29.find((int)'4');
    aVLTree29.insert(0);
    AVLTree.Node node36 = aVLTree29.getRoot();
    AVLTree.Node node37 = aVLTree29.getRoot();
    int i38 = aVLTree17.getBalance(node37);
    aVLTree17.insert(1);
    aVLTree17.delete((int)(short)-1);
    AVLTree aVLTree43 = new AVLTree();
    AVLTree.Node node44 = null;
    int i45 = aVLTree43.getBalance(node44);
    AVLTree.Node node47 = aVLTree43.find((int)'4');
    aVLTree43.insert(0);
    AVLTree.Node node50 = aVLTree43.getRoot();
    AVLTree.Node node51 = aVLTree43.getRoot();
    int i52 = aVLTree43.height();
    AVLTree.Node node53 = aVLTree43.getRoot();
    AVLTree.Node node54 = aVLTree43.getRoot();
    int i55 = aVLTree17.getBalance(node54);
    int i56 = aVLTree0.getBalance(node54);
    AVLTree.Node node58 = aVLTree0.find((int)' ');
    AVLTree aVLTree59 = new AVLTree();
    AVLTree.Node node60 = null;
    int i61 = aVLTree59.getBalance(node60);
    AVLTree.Node node63 = aVLTree59.find((int)'4');
    aVLTree59.insert(0);
    aVLTree59.insert((int)(byte)10);
    AVLTree.Node node69 = aVLTree59.find((int)(short)1);
    AVLTree.Node node71 = aVLTree59.find((int)(byte)100);
    AVLTree.Node node72 = aVLTree59.getRoot();
    AVLTree aVLTree73 = new AVLTree();
    AVLTree.Node node74 = null;
    int i75 = aVLTree73.getBalance(node74);
    AVLTree aVLTree76 = new AVLTree();
    AVLTree.Node node77 = null;
    int i78 = aVLTree76.getBalance(node77);
    AVLTree.Node node80 = aVLTree76.find((int)'4');
    aVLTree76.insert(0);
    AVLTree.Node node83 = aVLTree76.getRoot();
    int i84 = aVLTree73.getBalance(node83);
    int i85 = aVLTree59.getBalance(node83);
    int i86 = aVLTree59.height();
    aVLTree59.delete((int)(short)1);
    aVLTree59.insert((int)(byte)100);
    int i91 = aVLTree59.height();
    AVLTree.Node node92 = aVLTree59.getRoot();
    int i93 = aVLTree0.getBalance(node92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    int i6 = aVLTree0.height();
    int i7 = aVLTree0.height();
    aVLTree0.insert((int)(byte)100);
    aVLTree0.delete((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node3 = null;
    int i4 = aVLTree0.getBalance(node3);
    AVLTree.Node node6 = aVLTree0.find((int)'4');
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    int i8 = aVLTree0.height();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    aVLTree9.insert(0);
    AVLTree.Node node14 = aVLTree9.getRoot();
    AVLTree.Node node15 = aVLTree9.getRoot();
    int i16 = aVLTree0.getBalance(node15);
    aVLTree0.insert((-1));
    int i19 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree aVLTree3 = new AVLTree();
    AVLTree.Node node4 = null;
    int i5 = aVLTree3.getBalance(node4);
    AVLTree.Node node7 = aVLTree3.find((int)'4');
    aVLTree3.insert(0);
    AVLTree.Node node10 = aVLTree3.getRoot();
    int i11 = aVLTree0.getBalance(node10);
    AVLTree aVLTree12 = new AVLTree();
    AVLTree.Node node13 = null;
    int i14 = aVLTree12.getBalance(node13);
    AVLTree.Node node16 = aVLTree12.find((int)'4');
    aVLTree12.insert(0);
    AVLTree.Node node19 = aVLTree12.getRoot();
    AVLTree.Node node20 = aVLTree12.getRoot();
    int i21 = aVLTree0.getBalance(node20);
    aVLTree0.insert(1);
    AVLTree.Node node25 = aVLTree0.find((int)'#');
    AVLTree.Node node27 = aVLTree0.find(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node27);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    AVLTree.Node node7 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.getRoot();
    int i9 = aVLTree0.height();
    AVLTree aVLTree10 = new AVLTree();
    AVLTree aVLTree11 = new AVLTree();
    AVLTree.Node node12 = null;
    int i13 = aVLTree11.getBalance(node12);
    AVLTree.Node node15 = aVLTree11.find((int)'4');
    aVLTree11.insert(0);
    AVLTree.Node node18 = aVLTree11.getRoot();
    int i19 = aVLTree10.getBalance(node18);
    int i20 = aVLTree0.getBalance(node18);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node23 = aVLTree0.getRoot();
    AVLTree aVLTree24 = new AVLTree();
    AVLTree.Node node25 = null;
    int i26 = aVLTree24.getBalance(node25);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    AVLTree.Node node31 = aVLTree27.find((int)'4');
    aVLTree27.insert(0);
    AVLTree.Node node34 = aVLTree27.getRoot();
    int i35 = aVLTree24.getBalance(node34);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    AVLTree.Node node40 = aVLTree36.find((int)'4');
    aVLTree36.insert(0);
    AVLTree.Node node43 = aVLTree36.getRoot();
    AVLTree.Node node44 = aVLTree36.getRoot();
    int i45 = aVLTree24.getBalance(node44);
    int i46 = aVLTree0.getBalance(node44);
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node49 = aVLTree0.getRoot();
    AVLTree.Node node51 = aVLTree0.find((int)'#');
    aVLTree0.delete(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)(short)10);
    aVLTree0.delete((int)(short)0);
    aVLTree0.delete((int)'4');
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree.Node node18 = aVLTree14.find((int)'4');
    aVLTree14.insert(0);
    int i21 = aVLTree14.height();
    AVLTree.Node node23 = aVLTree14.find((int)(short)-1);
    aVLTree14.insert((int)(short)1);
    AVLTree.Node node26 = aVLTree14.getRoot();
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    aVLTree27.insert(0);
    AVLTree.Node node32 = aVLTree27.getRoot();
    int i33 = aVLTree14.getBalance(node32);
    aVLTree14.insert(10);
    AVLTree.Node node36 = aVLTree14.getRoot();
    int i37 = aVLTree0.getBalance(node36);
    AVLTree aVLTree38 = new AVLTree();
    AVLTree.Node node39 = null;
    int i40 = aVLTree38.getBalance(node39);
    AVLTree aVLTree41 = new AVLTree();
    AVLTree.Node node42 = null;
    int i43 = aVLTree41.getBalance(node42);
    AVLTree.Node node45 = aVLTree41.find((int)'4');
    aVLTree41.insert(0);
    AVLTree.Node node48 = aVLTree41.getRoot();
    int i49 = aVLTree38.getBalance(node48);
    AVLTree aVLTree50 = new AVLTree();
    AVLTree.Node node51 = null;
    int i52 = aVLTree50.getBalance(node51);
    AVLTree.Node node54 = aVLTree50.find((int)'4');
    aVLTree50.insert(0);
    AVLTree.Node node57 = aVLTree50.getRoot();
    AVLTree.Node node58 = aVLTree50.getRoot();
    int i59 = aVLTree38.getBalance(node58);
    aVLTree38.insert(1);
    aVLTree38.delete((int)(short)-1);
    AVLTree aVLTree64 = new AVLTree();
    AVLTree.Node node65 = null;
    int i66 = aVLTree64.getBalance(node65);
    AVLTree.Node node68 = aVLTree64.find((int)'4');
    aVLTree64.insert(0);
    AVLTree.Node node71 = aVLTree64.getRoot();
    AVLTree.Node node72 = aVLTree64.getRoot();
    int i73 = aVLTree64.height();
    AVLTree.Node node74 = aVLTree64.getRoot();
    AVLTree.Node node75 = aVLTree64.getRoot();
    int i76 = aVLTree38.getBalance(node75);
    int i77 = aVLTree0.getBalance(node75);
    aVLTree0.delete((int)' ');
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert((int)' ');
    AVLTree aVLTree7 = new AVLTree();
    AVLTree.Node node8 = null;
    int i9 = aVLTree7.getBalance(node8);
    AVLTree.Node node11 = aVLTree7.find((int)'4');
    aVLTree7.insert(0);
    int i14 = aVLTree7.height();
    AVLTree.Node node16 = aVLTree7.find((int)(short)-1);
    AVLTree.Node node18 = aVLTree7.find((int)'#');
    AVLTree.Node node20 = aVLTree7.find((int)(byte)-1);
    aVLTree7.delete(100);
    AVLTree aVLTree23 = new AVLTree();
    AVLTree.Node node24 = null;
    int i25 = aVLTree23.getBalance(node24);
    aVLTree23.insert(0);
    AVLTree.Node node28 = aVLTree23.getRoot();
    AVLTree.Node node29 = aVLTree23.getRoot();
    int i30 = aVLTree7.getBalance(node29);
    AVLTree.Node node31 = aVLTree7.getRoot();
    int i32 = aVLTree0.getBalance(node31);
    AVLTree.Node node33 = aVLTree0.getRoot();
    AVLTree aVLTree34 = new AVLTree();
    aVLTree34.insert(0);
    AVLTree.Node node38 = aVLTree34.find(100);
    AVLTree aVLTree39 = new AVLTree();
    AVLTree.Node node40 = null;
    int i41 = aVLTree39.getBalance(node40);
    aVLTree39.insert(0);
    int i44 = aVLTree39.height();
    aVLTree39.delete((int)(byte)-1);
    AVLTree aVLTree47 = new AVLTree();
    AVLTree.Node node48 = null;
    int i49 = aVLTree47.getBalance(node48);
    AVLTree.Node node51 = aVLTree47.find((int)'4');
    aVLTree47.insert(0);
    AVLTree.Node node54 = aVLTree47.getRoot();
    int i55 = aVLTree39.getBalance(node54);
    int i56 = aVLTree34.getBalance(node54);
    aVLTree34.insert((int)(short)-1);
    aVLTree34.delete((int)'4');
    aVLTree34.delete((int)' ');
    AVLTree.Node node63 = aVLTree34.getRoot();
    int i64 = aVLTree0.getBalance(node63);
    AVLTree.Node node66 = aVLTree0.find(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node66);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    int i8 = aVLTree0.height();
    aVLTree0.insert(10);
    aVLTree0.insert((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.insert((int)(short)-1);
    int i25 = aVLTree0.height();
    aVLTree0.insert((int)'#');
    AVLTree aVLTree28 = new AVLTree();
    AVLTree.Node node29 = null;
    int i30 = aVLTree28.getBalance(node29);
    AVLTree.Node node32 = aVLTree28.find((int)'4');
    aVLTree28.insert(0);
    int i35 = aVLTree28.height();
    AVLTree.Node node37 = aVLTree28.find((int)(short)-1);
    AVLTree.Node node39 = aVLTree28.find((int)'#');
    AVLTree.Node node41 = aVLTree28.find((int)(byte)-1);
    aVLTree28.delete(100);
    AVLTree.Node node44 = aVLTree28.getRoot();
    AVLTree aVLTree45 = new AVLTree();
    AVLTree.Node node46 = null;
    int i47 = aVLTree45.getBalance(node46);
    AVLTree aVLTree48 = new AVLTree();
    AVLTree.Node node49 = null;
    int i50 = aVLTree48.getBalance(node49);
    AVLTree.Node node52 = aVLTree48.find((int)'4');
    aVLTree48.insert(0);
    AVLTree.Node node55 = aVLTree48.getRoot();
    int i56 = aVLTree45.getBalance(node55);
    AVLTree aVLTree57 = new AVLTree();
    AVLTree.Node node58 = null;
    int i59 = aVLTree57.getBalance(node58);
    AVLTree.Node node61 = aVLTree57.find((int)'4');
    aVLTree57.insert(0);
    AVLTree.Node node64 = aVLTree57.getRoot();
    AVLTree.Node node65 = aVLTree57.getRoot();
    int i66 = aVLTree45.getBalance(node65);
    aVLTree45.insert(1);
    aVLTree45.delete((int)(short)-1);
    AVLTree aVLTree71 = new AVLTree();
    AVLTree.Node node72 = null;
    int i73 = aVLTree71.getBalance(node72);
    AVLTree.Node node75 = aVLTree71.find((int)'4');
    aVLTree71.insert(0);
    AVLTree.Node node78 = aVLTree71.getRoot();
    AVLTree.Node node79 = aVLTree71.getRoot();
    int i80 = aVLTree71.height();
    AVLTree.Node node81 = aVLTree71.getRoot();
    AVLTree.Node node82 = aVLTree71.getRoot();
    int i83 = aVLTree45.getBalance(node82);
    int i84 = aVLTree28.getBalance(node82);
    int i85 = aVLTree0.getBalance(node82);
    aVLTree0.insert((int)(short)10);
    aVLTree0.insert((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    int i14 = aVLTree0.height();
    AVLTree.Node node16 = aVLTree0.find(2);
    int i17 = aVLTree0.height();
    aVLTree0.delete((int)(short)1);
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    AVLTree.Node node27 = aVLTree20.getRoot();
    int i28 = aVLTree20.height();
    aVLTree20.insert((int)(byte)-1);
    AVLTree aVLTree31 = new AVLTree();
    AVLTree.Node node32 = null;
    int i33 = aVLTree31.getBalance(node32);
    aVLTree31.insert(0);
    int i36 = aVLTree31.height();
    AVLTree aVLTree37 = new AVLTree();
    AVLTree.Node node38 = null;
    int i39 = aVLTree37.getBalance(node38);
    AVLTree.Node node41 = aVLTree37.find((int)'4');
    aVLTree37.insert(0);
    aVLTree37.insert((int)(byte)10);
    AVLTree.Node node47 = aVLTree37.find((int)(short)1);
    AVLTree.Node node49 = aVLTree37.find((int)(byte)100);
    int i50 = aVLTree37.height();
    AVLTree.Node node51 = aVLTree37.getRoot();
    int i52 = aVLTree31.getBalance(node51);
    int i53 = aVLTree20.getBalance(node51);
    int i54 = aVLTree0.getBalance(node51);
    aVLTree0.delete((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    AVLTree.Node node21 = aVLTree13.getRoot();
    AVLTree.Node node23 = aVLTree13.find(10);
    AVLTree.Node node25 = aVLTree13.find((int)(byte)-1);
    AVLTree.Node node26 = aVLTree13.getRoot();
    int i27 = aVLTree0.getBalance(node26);
    aVLTree0.delete((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    AVLTree.Node node13 = aVLTree0.find((int)(byte)-1);
    aVLTree0.insert((int)(short)100);
    AVLTree.Node node16 = aVLTree0.getRoot();
    int i17 = aVLTree0.height();
    aVLTree0.insert((int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    AVLTree.Node node11 = aVLTree0.find((int)'#');
    int i12 = aVLTree0.height();
    AVLTree.Node node13 = aVLTree0.getRoot();
    AVLTree aVLTree14 = new AVLTree();
    AVLTree.Node node15 = null;
    int i16 = aVLTree14.getBalance(node15);
    AVLTree.Node node18 = aVLTree14.find((int)'4');
    aVLTree14.insert(0);
    AVLTree.Node node21 = aVLTree14.getRoot();
    AVLTree.Node node22 = aVLTree14.getRoot();
    int i23 = aVLTree14.height();
    AVLTree.Node node24 = aVLTree14.getRoot();
    AVLTree.Node node25 = aVLTree14.getRoot();
    int i26 = aVLTree0.getBalance(node25);
    AVLTree aVLTree27 = new AVLTree();
    AVLTree.Node node28 = null;
    int i29 = aVLTree27.getBalance(node28);
    aVLTree27.insert(0);
    AVLTree.Node node32 = aVLTree27.getRoot();
    AVLTree aVLTree33 = new AVLTree();
    AVLTree.Node node34 = null;
    int i35 = aVLTree33.getBalance(node34);
    AVLTree.Node node37 = aVLTree33.find((int)'4');
    aVLTree33.insert(0);
    aVLTree33.insert((int)(byte)10);
    AVLTree.Node node43 = aVLTree33.find((int)(short)1);
    AVLTree.Node node45 = aVLTree33.find((int)(byte)100);
    AVLTree.Node node46 = aVLTree33.getRoot();
    AVLTree aVLTree47 = new AVLTree();
    AVLTree.Node node48 = null;
    int i49 = aVLTree47.getBalance(node48);
    AVLTree aVLTree50 = new AVLTree();
    AVLTree.Node node51 = null;
    int i52 = aVLTree50.getBalance(node51);
    AVLTree.Node node54 = aVLTree50.find((int)'4');
    aVLTree50.insert(0);
    AVLTree.Node node57 = aVLTree50.getRoot();
    int i58 = aVLTree47.getBalance(node57);
    int i59 = aVLTree33.getBalance(node57);
    int i60 = aVLTree33.height();
    AVLTree.Node node61 = aVLTree33.getRoot();
    int i62 = aVLTree27.getBalance(node61);
    int i63 = aVLTree0.getBalance(node61);
    AVLTree aVLTree64 = new AVLTree();
    aVLTree64.delete((int)(short)1);
    AVLTree aVLTree67 = new AVLTree();
    AVLTree.Node node68 = null;
    int i69 = aVLTree67.getBalance(node68);
    AVLTree.Node node71 = aVLTree67.find((int)'4');
    aVLTree67.insert(0);
    int i74 = aVLTree67.height();
    AVLTree.Node node76 = aVLTree67.find((int)(short)-1);
    AVLTree.Node node78 = aVLTree67.find((int)'#');
    AVLTree.Node node80 = aVLTree67.find((int)(byte)-1);
    aVLTree67.delete(100);
    AVLTree.Node node83 = aVLTree67.getRoot();
    int i84 = aVLTree64.getBalance(node83);
    int i85 = aVLTree0.getBalance(node83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.delete(1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    int i20 = aVLTree13.height();
    AVLTree.Node node22 = aVLTree13.find((int)(short)-1);
    aVLTree13.insert((int)(short)1);
    AVLTree.Node node25 = aVLTree13.getRoot();
    aVLTree13.delete((int)(byte)0);
    AVLTree.Node node28 = aVLTree13.getRoot();
    int i29 = aVLTree0.getBalance(node28);
    AVLTree aVLTree30 = new AVLTree();
    AVLTree.Node node31 = null;
    int i32 = aVLTree30.getBalance(node31);
    AVLTree.Node node34 = aVLTree30.find((int)'4');
    aVLTree30.insert(0);
    int i37 = aVLTree30.height();
    AVLTree.Node node39 = aVLTree30.find((int)(short)-1);
    AVLTree.Node node41 = aVLTree30.find((int)'#');
    AVLTree.Node node43 = aVLTree30.find((int)(byte)-1);
    aVLTree30.delete(100);
    AVLTree aVLTree46 = new AVLTree();
    AVLTree.Node node47 = null;
    int i48 = aVLTree46.getBalance(node47);
    aVLTree46.insert(0);
    AVLTree.Node node51 = aVLTree46.getRoot();
    AVLTree.Node node52 = aVLTree46.getRoot();
    int i53 = aVLTree30.getBalance(node52);
    int i54 = aVLTree0.getBalance(node52);
    aVLTree0.insert((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    aVLTree0.insert((int)(byte)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    aVLTree0.delete((int)'a');
    aVLTree0.insert((-1));
    aVLTree0.delete((int)(byte)0);
    AVLTree aVLTree16 = new AVLTree();
    AVLTree.Node node17 = null;
    int i18 = aVLTree16.getBalance(node17);
    aVLTree16.insert(0);
    int i21 = aVLTree16.height();
    AVLTree.Node node22 = aVLTree16.getRoot();
    AVLTree.Node node23 = aVLTree16.getRoot();
    int i24 = aVLTree0.getBalance(node23);
    int i25 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.insert((int)(short)-1);
    AVLTree.Node node8 = aVLTree0.getRoot();
    AVLTree aVLTree9 = new AVLTree();
    AVLTree.Node node10 = null;
    int i11 = aVLTree9.getBalance(node10);
    AVLTree.Node node13 = aVLTree9.find((int)'4');
    aVLTree9.insert(0);
    int i16 = aVLTree9.height();
    AVLTree.Node node18 = aVLTree9.find((int)(short)-1);
    aVLTree9.insert((int)(short)1);
    AVLTree aVLTree21 = new AVLTree();
    AVLTree.Node node22 = null;
    int i23 = aVLTree21.getBalance(node22);
    aVLTree21.insert(0);
    AVLTree.Node node26 = aVLTree21.getRoot();
    AVLTree.Node node27 = aVLTree21.getRoot();
    AVLTree.Node node29 = aVLTree21.find((int)(short)10);
    aVLTree21.insert((int)(byte)1);
    AVLTree.Node node32 = aVLTree21.getRoot();
    int i33 = aVLTree9.getBalance(node32);
    aVLTree9.delete((int)'#');
    AVLTree.Node node37 = aVLTree9.find((int)(byte)10);
    aVLTree9.delete((int)'4');
    int i40 = aVLTree9.height();
    AVLTree.Node node41 = aVLTree9.getRoot();
    int i42 = aVLTree0.getBalance(node41);
    // The following exception was thrown during execution in test generation
    try {
    aVLTree0.insert(0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    AVLTree.Node node12 = aVLTree0.getRoot();
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    aVLTree13.insert(0);
    AVLTree.Node node18 = aVLTree13.getRoot();
    int i19 = aVLTree0.getBalance(node18);
    aVLTree0.insert(10);
    AVLTree.Node node22 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    AVLTree aVLTree25 = new AVLTree();
    AVLTree.Node node26 = null;
    int i27 = aVLTree25.getBalance(node26);
    AVLTree.Node node29 = aVLTree25.find((int)'4');
    aVLTree25.insert(0);
    AVLTree.Node node32 = aVLTree25.getRoot();
    AVLTree.Node node33 = aVLTree25.getRoot();
    aVLTree25.insert((int)(byte)1);
    AVLTree.Node node36 = aVLTree25.getRoot();
    int i37 = aVLTree0.getBalance(node36);
    int i38 = aVLTree0.height();
    aVLTree0.delete((int)(short)100);
    AVLTree.Node node41 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    int i5 = aVLTree0.height();
    aVLTree0.delete((int)(byte)-1);
    aVLTree0.delete((int)(short)0);
    int i10 = aVLTree0.height();
    aVLTree0.delete(1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    int i20 = aVLTree13.height();
    AVLTree.Node node22 = aVLTree13.find((int)(short)-1);
    aVLTree13.insert((int)(short)1);
    AVLTree.Node node25 = aVLTree13.getRoot();
    aVLTree13.delete((int)(byte)0);
    AVLTree.Node node28 = aVLTree13.getRoot();
    int i29 = aVLTree0.getBalance(node28);
    AVLTree.Node node30 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node30);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    aVLTree0.insert(0);
    AVLTree.Node node5 = aVLTree0.getRoot();
    AVLTree.Node node6 = aVLTree0.getRoot();
    AVLTree.Node node8 = aVLTree0.find((int)(short)10);
    AVLTree.Node node9 = aVLTree0.getRoot();
    int i10 = aVLTree0.height();
    AVLTree.Node node11 = aVLTree0.getRoot();
    int i12 = aVLTree0.height();
    AVLTree.Node node14 = aVLTree0.find((-1));
    aVLTree0.delete((int)(byte)10);
    AVLTree.Node node17 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node17);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }

    AVLTree aVLTree0 = new AVLTree();
    AVLTree.Node node1 = null;
    int i2 = aVLTree0.getBalance(node1);
    AVLTree.Node node4 = aVLTree0.find((int)'4');
    aVLTree0.insert(0);
    int i7 = aVLTree0.height();
    AVLTree.Node node9 = aVLTree0.find((int)(short)-1);
    aVLTree0.insert((int)(short)1);
    aVLTree0.delete((int)(byte)0);
    AVLTree.Node node14 = aVLTree0.getRoot();
    AVLTree.Node node15 = aVLTree0.getRoot();
    AVLTree.Node node16 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node16);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)' ');
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    aVLTree8.insert(0);
    AVLTree.Node node13 = aVLTree8.getRoot();
    AVLTree.Node node14 = aVLTree8.getRoot();
    AVLTree.Node node16 = aVLTree8.find((int)(short)10);
    aVLTree8.insert((int)(byte)1);
    AVLTree.Node node19 = aVLTree8.getRoot();
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    int i27 = aVLTree20.height();
    AVLTree.Node node29 = aVLTree20.find((int)(short)-1);
    AVLTree.Node node31 = aVLTree20.find((int)'#');
    AVLTree.Node node33 = aVLTree20.find((int)(byte)-1);
    aVLTree20.delete(100);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    aVLTree36.insert(0);
    AVLTree.Node node41 = aVLTree36.getRoot();
    AVLTree.Node node42 = aVLTree36.getRoot();
    int i43 = aVLTree20.getBalance(node42);
    AVLTree.Node node45 = aVLTree20.find((int)(short)0);
    int i46 = aVLTree8.getBalance(node45);
    int i47 = aVLTree0.getBalance(node45);
    int i48 = aVLTree0.height();
    aVLTree0.insert((int)(byte)1);
    AVLTree.Node node51 = aVLTree0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node51);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node4 = aVLTree0.find(100);
    AVLTree aVLTree5 = new AVLTree();
    AVLTree.Node node6 = null;
    int i7 = aVLTree5.getBalance(node6);
    aVLTree5.insert(0);
    int i10 = aVLTree5.height();
    aVLTree5.delete((int)(byte)-1);
    AVLTree aVLTree13 = new AVLTree();
    AVLTree.Node node14 = null;
    int i15 = aVLTree13.getBalance(node14);
    AVLTree.Node node17 = aVLTree13.find((int)'4');
    aVLTree13.insert(0);
    AVLTree.Node node20 = aVLTree13.getRoot();
    int i21 = aVLTree5.getBalance(node20);
    int i22 = aVLTree0.getBalance(node20);
    aVLTree0.delete(100);
    AVLTree.Node node25 = aVLTree0.getRoot();
    AVLTree.Node node26 = aVLTree0.getRoot();
    aVLTree0.delete((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node26);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }

    AVLTree aVLTree0 = new AVLTree();
    aVLTree0.insert(0);
    AVLTree.Node node3 = aVLTree0.getRoot();
    aVLTree0.delete((int)(byte)100);
    aVLTree0.delete((int)' ');
    AVLTree aVLTree8 = new AVLTree();
    AVLTree.Node node9 = null;
    int i10 = aVLTree8.getBalance(node9);
    aVLTree8.insert(0);
    AVLTree.Node node13 = aVLTree8.getRoot();
    AVLTree.Node node14 = aVLTree8.getRoot();
    AVLTree.Node node16 = aVLTree8.find((int)(short)10);
    aVLTree8.insert((int)(byte)1);
    AVLTree.Node node19 = aVLTree8.getRoot();
    AVLTree aVLTree20 = new AVLTree();
    AVLTree.Node node21 = null;
    int i22 = aVLTree20.getBalance(node21);
    AVLTree.Node node24 = aVLTree20.find((int)'4');
    aVLTree20.insert(0);
    int i27 = aVLTree20.height();
    AVLTree.Node node29 = aVLTree20.find((int)(short)-1);
    AVLTree.Node node31 = aVLTree20.find((int)'#');
    AVLTree.Node node33 = aVLTree20.find((int)(byte)-1);
    aVLTree20.delete(100);
    AVLTree aVLTree36 = new AVLTree();
    AVLTree.Node node37 = null;
    int i38 = aVLTree36.getBalance(node37);
    aVLTree36.insert(0);
    AVLTree.Node node41 = aVLTree36.getRoot();
    AVLTree.Node node42 = aVLTree36.getRoot();
    int i43 = aVLTree20.getBalance(node42);
    AVLTree.Node node45 = aVLTree20.find((int)(short)0);
    int i46 = aVLTree8.getBalance(node45);
    int i47 = aVLTree0.getBalance(node45);
    AVLTree.Node node48 = aVLTree0.getRoot();
    int i49 = aVLTree0.height();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(node33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(node48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);

  }

}
