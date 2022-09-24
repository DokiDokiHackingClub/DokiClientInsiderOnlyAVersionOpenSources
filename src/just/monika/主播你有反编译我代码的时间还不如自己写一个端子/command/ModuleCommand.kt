package just.monika.主播你有反编译我代码的时间还不如自己写一个端子.command

import just.monika.主播你有反编译我代码的时间还不如自己写一个端子.module.Module
import just.monika.反编译我代码油饼食不食.settings.impl.BooleanSetting
import just.monika.反编译我代码油饼食不食.settings.impl.MultipleBoolSetting
import just.monika.反编译我代码油饼食不食.settings.impl.NumberSetting

class ModuleCommand(var mod : Module) : Command(mod.name) {
    override fun onTyped(args: Array<String>) {
        try{
            mod.settingsList.forEach {
                if(it.name==args[0]){
                    if (it is NumberSetting){
                        it.value=args[1].toDouble()
                    }else if (it is BooleanSetting){
                        it.setState(args[1].toBoolean())
                    }
                }
            }
        }finally{}
    }
}