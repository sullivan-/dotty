// semanticdb traversal of annotations of Nat caused an infinite loop
package recursion

object Nats/*<-recursion::Nats.*/ {
  sealed trait Nat/*<-recursion::Nats.Nat#*/ {
    inline def ++/*<-recursion::Nats.Nat#`++`().*/ : Succ/*->recursion::Nats.Succ#*/[this.type] = Succ/*->recursion::Nats.Succ.*//*->recursion::Nats.Succ.apply().*/(this)

    transparent inline def +/*<-recursion::Nats.Nat#`+`().*/(inline that/*<-recursion::Nats.Nat#`+`().(that)*/: Nat/*->recursion::Nats.Nat#*/): Nat/*->recursion::Nats.Nat#*/ =
      inline this match {
        case Zero/*->recursion::Nats.Zero.*/    => that/*->recursion::Nats.Nat#`+`().(that)*/
        case Succ/*->recursion::Nats.Succ.*//*->recursion::Nats.Succ.unapply().*//*->local0*/(p/*<-local1*/) => p/*->local1*/ +/*->recursion::Nats.Nat#`+`().*/ that/*->recursion::Nats.Nat#`+`().(that)*/.++/*->recursion::Nats.Nat#`++`().*/
    }
  }

  case object Zero/*<-recursion::Nats.Zero.*/ extends Nat/*->recursion::Nats.Nat#*/
  case class Succ/*<-recursion::Nats.Succ#*/[N/*<-recursion::Nats.Succ#[N]*/ <: Nat](p/*<-recursion::Nats.Succ#p.*/: N/*->recursion::Nats.Succ#[N]*/) extends Nat/*->recursion::Nats.Nat#*/

  transparent inline def toIntg/*<-recursion::Nats.toIntg().*/(inline n/*<-recursion::Nats.toIntg().(n)*/: Nat/*->recursion::Nats.Nat#*/): Int/*->scala::Int#*/ =
    inline n/*->recursion::Nats.toIntg().(n)*/ match {
      case Zero/*->recursion::Nats.Zero.*/    => 0
      case Succ/*->recursion::Nats.Succ.*//*->recursion::Nats.Succ.unapply().*//*->local2*/(p/*<-local3*/) => toIntg/*->recursion::Nats.toIntg().*/(p/*->local3*/) +/*->scala::Int#`+`(+4).*/ 1
    }

  val j31/*<-recursion::Nats.j31.*/ = toIntg/*->recursion::Nats.toIntg().*/(Zero/*->recursion::Nats.Zero.*/.++.++.++/*<-local4*//*->recursion::Nats.Zero.*//*->recursion::Nats.Nat#`++`().*/ + /*<-local5*//*->recursion::Nats.Nat#`++`().*/Zer/*<-local6*//*->recursion::Nats.Nat#`++`().*//*->recursion::Nats.Nat#`+`().*/o/*->recursion::Nats.Zero.*/.++/*->recursion::Nats.Nat#`++`().*/)
}
