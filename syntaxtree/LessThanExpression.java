//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> PrimaryExpression()
 * f1 -> "<"
 * f2 -> PrimaryExpression()
 */
public class LessThanExpression implements Node {
   public PrimaryExpression f0;
   public NodeToken f1;
   public PrimaryExpression f2;

   public LessThanExpression(PrimaryExpression n0, NodeToken n1, PrimaryExpression n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public LessThanExpression(PrimaryExpression n0, PrimaryExpression n1) {
      f0 = n0;
      f1 = new NodeToken("<");
      f2 = n1;
   }

   public void accept(visitor.Visitor v) throws Exception {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) throws Exception {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) throws Exception {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) throws Exception {
      v.visit(this,argu);
   }
}

