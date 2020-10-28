package ru.netology.task_2;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
