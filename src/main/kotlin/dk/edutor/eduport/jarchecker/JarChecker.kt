package dk.edutor.eduport.jarchecker

import dk.edutor.eduport.*

class JarChecker : Port {

  override fun check(challenge: Challenge, solution: Solution): Assessment {
    TODO("not implemented")
    }

  override fun sayHello(text: String) = "Hello $text from JarChecker Port"

//  override fun sayHello(text: String) : String {
//    return "Hello $text from JarChecker Port"
//    }

  }