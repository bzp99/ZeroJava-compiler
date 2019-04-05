//
// Generated by JTB 1.3.2 DIT@UoA patched
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors must implement this interface.
 */

public interface GJVisitor<R,A> {

   //
   // GJ Auto class visitors
   //

   public R visit(NodeList n, A argu) throws Exception;
   public R visit(NodeListOptional n, A argu) throws Exception;
   public R visit(NodeOptional n, A argu) throws Exception;
   public R visit(NodeSequence n, A argu) throws Exception;
   public R visit(NodeToken n, A argu) throws Exception;

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( MethodDeclaration() )*
    * f1 -> MainMethodDeclaration()
    * f2 -> <EOF>
    */
   public R visit(Goal n, A argu) throws Exception;

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> ";"
    */
   public R visit(VarDeclaration n, A argu) throws Exception;

   /**
    * f0 -> "void"
    * f1 -> "main"
    * f2 -> "("
    * f3 -> "void"
    * f4 -> ")"
    * f5 -> "{"
    * f6 -> ( VarDeclaration() )*
    * f7 -> ( Statement() )*
    * f8 -> "}"
    */
   public R visit(MainMethodDeclaration n, A argu) throws Exception;

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ( FormalParameterList() )?
    * f4 -> ")"
    * f5 -> "{"
    * f6 -> ( VarDeclaration() )*
    * f7 -> ( Statement() )*
    * f8 -> "return"
    * f9 -> Expression()
    * f10 -> ";"
    * f11 -> "}"
    */
   public R visit(MethodDeclaration n, A argu) throws Exception;

   /**
    * f0 -> FormalParameter()
    * f1 -> FormalParameterTail()
    */
   public R visit(FormalParameterList n, A argu) throws Exception;

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    */
   public R visit(FormalParameter n, A argu) throws Exception;

   /**
    * f0 -> ( FormalParameterTerm() )*
    */
   public R visit(FormalParameterTail n, A argu) throws Exception;

   /**
    * f0 -> ","
    * f1 -> FormalParameter()
    */
   public R visit(FormalParameterTerm n, A argu) throws Exception;

   /**
    * f0 -> ArrayType()
    *       | BooleanType()
    *       | IntegerType()
    *       | Identifier()
    */
   public R visit(Type n, A argu) throws Exception;

   /**
    * f0 -> "int"
    * f1 -> "["
    * f2 -> "]"
    */
   public R visit(ArrayType n, A argu) throws Exception;

   /**
    * f0 -> "boolean"
    */
   public R visit(BooleanType n, A argu) throws Exception;

   /**
    * f0 -> "int"
    */
   public R visit(IntegerType n, A argu) throws Exception;

   /**
    * f0 -> Block()
    *       | AssignmentStatement()
    *       | ArrayAssignmentStatement()
    *       | PlusPlusExpression()
    *       | MinusMinusExpression()
    *       | IfStatement()
    *       | WhileStatement()
    *       | PrintStatement()
    *       | ReadPrimaryTape()
    *       | ReadPrivateTape()
    *       | AnswerStatement()
    */
   public R visit(Statement n, A argu) throws Exception;

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public R visit(Block n, A argu) throws Exception;

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public R visit(AssignmentStatement n, A argu) throws Exception;

   /**
    * f0 -> Identifier()
    * f1 -> "["
    * f2 -> Expression()
    * f3 -> "]"
    * f4 -> "="
    * f5 -> Expression()
    * f6 -> ";"
    */
   public R visit(ArrayAssignmentStatement n, A argu) throws Exception;

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> "else"
    * f6 -> Statement()
    */
   public R visit(IfStatement n, A argu) throws Exception;

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(WhileStatement n, A argu) throws Exception;

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(PrintStatement n, A argu) throws Exception;

   /**
    * f0 -> "PrimaryTape.read"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(ReadPrimaryTape n, A argu) throws Exception;

   /**
    * f0 -> "PrivateTape.read"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(ReadPrivateTape n, A argu) throws Exception;

   /**
    * f0 -> "Prover.answer"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(AnswerStatement n, A argu) throws Exception;

   /**
    * f0 -> AndExpression()
    *       | OrExpression()
    *       | EqExpression()
    *       | LessThanExpression()
    *       | GreaterThanExpression()
    *       | LessEqualThanExpression()
    *       | GreaterEqualThanExpression()
    *       | PlusExpression()
    *       | MinusExpression()
    *       | TimesExpression()
    *       | ArrayLookup()
    *       | MessageSend()
    *       | MethodCall()
    *       | Clause()
    */
   public R visit(Expression n, A argu) throws Exception;

   /**
    * f0 -> Clause()
    * f1 -> "&&"
    * f2 -> Clause()
    */
   public R visit(AndExpression n, A argu) throws Exception;

   /**
    * f0 -> Clause()
    * f1 -> "||"
    * f2 -> Clause()
    */
   public R visit(OrExpression n, A argu) throws Exception;

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "=="
    * f2 -> PrimaryExpression()
    */
   public R visit(EqExpression n, A argu) throws Exception;

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "<"
    * f2 -> PrimaryExpression()
    */
   public R visit(LessThanExpression n, A argu) throws Exception;

   /**
    * f0 -> PrimaryExpression()
    * f1 -> ">"
    * f2 -> PrimaryExpression()
    */
   public R visit(GreaterThanExpression n, A argu) throws Exception;

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "<="
    * f2 -> PrimaryExpression()
    */
   public R visit(LessEqualThanExpression n, A argu) throws Exception;

   /**
    * f0 -> PrimaryExpression()
    * f1 -> ">="
    * f2 -> PrimaryExpression()
    */
   public R visit(GreaterEqualThanExpression n, A argu) throws Exception;

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "+"
    * f2 -> PrimaryExpression()
    */
   public R visit(PlusExpression n, A argu) throws Exception;

   /**
    * f0 -> Identifier()
    * f1 -> "++"
    * f2 -> ";"
    */
   public R visit(PlusPlusExpression n, A argu) throws Exception;

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "-"
    * f2 -> PrimaryExpression()
    */
   public R visit(MinusExpression n, A argu) throws Exception;

   /**
    * f0 -> Identifier()
    * f1 -> "--"
    * f2 -> ";"
    */
   public R visit(MinusMinusExpression n, A argu) throws Exception;

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "*"
    * f2 -> PrimaryExpression()
    */
   public R visit(TimesExpression n, A argu) throws Exception;

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "["
    * f2 -> PrimaryExpression()
    * f3 -> "]"
    */
   public R visit(ArrayLookup n, A argu) throws Exception;

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( ExpressionList() )?
    * f5 -> ")"
    */
   public R visit(MessageSend n, A argu) throws Exception;

   /**
    * f0 -> Identifier()
    * f1 -> "("
    * f2 -> ( ExpressionList() )?
    * f3 -> ")"
    */
   public R visit(MethodCall n, A argu) throws Exception;

   /**
    * f0 -> Expression()
    * f1 -> ExpressionTail()
    */
   public R visit(ExpressionList n, A argu) throws Exception;

   /**
    * f0 -> ( ExpressionTerm() )*
    */
   public R visit(ExpressionTail n, A argu) throws Exception;

   /**
    * f0 -> ","
    * f1 -> Expression()
    */
   public R visit(ExpressionTerm n, A argu) throws Exception;

   /**
    * f0 -> NotExpression()
    *       | PrimaryExpression()
    */
   public R visit(Clause n, A argu) throws Exception;

   /**
    * f0 -> IntegerLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    *       | Identifier()
    *       | ArrayAllocationExpression()
    *       | AllocationExpression()
    *       | BracketExpression()
    */
   public R visit(PrimaryExpression n, A argu) throws Exception;

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n, A argu) throws Exception;

   /**
    * f0 -> "true"
    */
   public R visit(TrueLiteral n, A argu) throws Exception;

   /**
    * f0 -> "false"
    */
   public R visit(FalseLiteral n, A argu) throws Exception;

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n, A argu) throws Exception;

   /**
    * f0 -> "new"
    * f1 -> "int"
    * f2 -> "["
    * f3 -> Expression()
    * f4 -> "]"
    */
   public R visit(ArrayAllocationExpression n, A argu) throws Exception;

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ")"
    */
   public R visit(AllocationExpression n, A argu) throws Exception;

   /**
    * f0 -> "!"
    * f1 -> Clause()
    */
   public R visit(NotExpression n, A argu) throws Exception;

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ")"
    */
   public R visit(BracketExpression n, A argu) throws Exception;

}
