package com.vaibhavmojidra.viewmodelfactoryjava;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import org.jetbrains.annotations.NotNull;

public class ViewModelFactoryMainActivity implements ViewModelProvider.Factory {
    private String initialName;

    public ViewModelFactoryMainActivity(String initialName) {
        this.initialName = initialName;
    }

    @NonNull
    @NotNull
    @Override
    public <T extends ViewModel> T create(@NonNull @NotNull Class<T> modelClass) {
        return (T) new ViewModelMainActivity(initialName);
    }
}
