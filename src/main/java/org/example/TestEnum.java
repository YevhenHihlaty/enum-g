package org.example;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@EnumCustomName(value = "simpleName")
public enum TestEnum {
    FIRST("One"),
    SECOND("Two");

    private final String simpleName;

}
