import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {

    val httpProtocol = http
        .baseUrl("https://jsonplaceholder.typicode.com")

    val scn = scenario("Basic Performance Test")
        .exec(http("Get User")
            .get("/users/1")
            .check(status().is(200))
        )

    setUp(
        scn.inject(atOnceUsers(10)) // Inject 10 users at once
    ).protocols(httpProtocol)
}
