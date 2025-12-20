package com.jay.tasks.mappers;

import com.jay.tasks.domain.dto.TaskListDto;
import com.jay.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    public TaskList fromDto(TaskListDto taskListDto);

    public TaskListDto toDto(TaskList taskList);

}
