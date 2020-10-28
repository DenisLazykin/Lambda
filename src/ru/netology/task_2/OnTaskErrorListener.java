package ru.netology.task_2;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
