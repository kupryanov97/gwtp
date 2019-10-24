package ru.test.arh.shared.dispatch;



import com.gwtplatform.dispatch.rpc.shared.Result;

public class AddTaskResult implements Result { 

  ru.test.arh.shared.dto.TableTestPojo1 result;

  protected AddTaskResult() {
    // Possibly for serialization.
  }

  public AddTaskResult(ru.test.arh.shared.dto.TableTestPojo1 result) {
    this.result = result;
  }

  public ru.test.arh.shared.dto.TableTestPojo1 getResult(){
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    AddTaskResult other = (AddTaskResult) obj;
    if (result == null) {
      if (other.result != null)
        return false;
    } else if (!result.equals(other.result))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 23;
    hashCode = (hashCode * 37) + (result == null ? 1 : result.hashCode());
    return hashCode;
  }

  @Override
  public String toString() {
    return "AddTaskResult["
                 + result
    + "]";
  }
}
