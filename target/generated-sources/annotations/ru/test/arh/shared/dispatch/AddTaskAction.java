package ru.test.arh.shared.dispatch;

import com.gwtplatform.dispatch.rpc.shared.Action;

public class AddTaskAction implements Action<AddTaskResult> { 

  ru.test.arh.shared.dto.TableTestPojo1 task;

  protected AddTaskAction() {
    // Possibly for serialization.
  }

  public AddTaskAction(ru.test.arh.shared.dto.TableTestPojo1 task) {
    this.task = task;
  }

  @Override
  public String getServiceName() {
    return "dispatch/";
  }

  @Override
  public boolean isSecured() {
    return false;
  }

  public ru.test.arh.shared.dto.TableTestPojo1 getTask(){
    return task;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    AddTaskAction other = (AddTaskAction) obj;
    if (task == null) {
      if (other.task != null)
        return false;
    } else if (!task.equals(other.task))
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 23;
    hashCode = (hashCode * 37) + (task == null ? 1 : task.hashCode());
    return hashCode;
  }

  @Override
  public String toString() {
    return "AddTaskAction["
                 + task
    + "]";
  }
}
