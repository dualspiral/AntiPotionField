package uk.co.drnaylor.antipotionfield.worldguardapi;

public class WorldGuardAPIException extends Exception {
  
  public enum WorldGuardExceptions
  {
    NotEnabled
  }
  
  public WorldGuardExceptions except;
  
  /**
   *
   * @param exception Exception to throw
   */
  public WorldGuardAPIException(WorldGuardExceptions exception)
  {
    except = exception;
  }
  
  public WorldGuardAPIException()
  {
    
  }
  
}
