package com.example.android.hilt.ui

import androidx.fragment.app.Fragment
import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.di.InMemoryLogger
import javax.inject.Inject

/**
 * 没有必要注入多遍，这个地方注入了，子类还可以也在进行注入，这个时候就重复了
 * 所有父类使用 EntryPoint 方式调用，而不是 AndroidEntryPoint
 */
//@AndroidEntryPoint
open class LogsBaseFragment : Fragment() {

    @InMemoryLogger
    @Inject
    lateinit var logger: LoggerDataSource

}