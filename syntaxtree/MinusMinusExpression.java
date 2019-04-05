//
// Generated by JTB 1.3.2 DIT@UoA patched
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> Identifier()
 * f1 -> "--"
 * f2 -> ";"
 */
public class MinusMinusExpression implements Node {
   public Identifier f0;
   public NodeToken f1;
   public NodeToken f2;

   public MinusMinusExpression(Identifier n0, NodeToken n1, NodeToken n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public MinusMinusExpression(Identifier n0) {
      f0 = n0;
      f1 = new NodeToken("--");
      f2 = new NodeToken(";");
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

